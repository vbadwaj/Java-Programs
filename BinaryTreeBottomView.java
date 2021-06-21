class Tree
{
    ArrayList<Integer> sol=new ArrayList<>();
    ArrayList<Node> level=new ArrayList<>();
    HashMap<Node,Integer> numbering=new HashMap<>();
    TreeMap<Integer,List<Integer>> treemap=new TreeMap<>();
    public ArrayList <Integer> bottomView(Node root)
    {
        numbering(root,0);
        levelorder(root);
        for(Node k:level){
            if(treemap.containsKey(numbering.get(k))){
                List<Integer> temp=treemap.get(numbering.get(k));
                temp.add(k.data);
                treemap.put(numbering.get(k),temp);
            }
            else{
               List<Integer> temp=new ArrayList<Integer>();
                temp.add(k.data);
                treemap.put(numbering.get(k),temp);
            }
        }
        
        for(int val:treemap.keySet()){
            sol.add(treemap.get(val).get(treemap.get(val).size()-1));
        }
        return sol;
    }
    private void levelorder(Node root){
        if(root==null)return;
        Deque<Node> q=new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()){
            int qlen=q.size();
            List<Node> subsol=new ArrayList<>();
            for(int i=0;i<qlen;i++){
                Node curr=q.poll();
                subsol.add(curr);
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            level.addAll(subsol);
        }
    }
    private void numbering(Node root,int hd){
        if(root==null)return;
        if(root!=null)
        numbering.put(root,hd);
        if(root.right!=null){
            numbering(root.right,hd+1);
        }
        if(root.left!=null){
            numbering(root.left,hd-1);
        }
    }
}
