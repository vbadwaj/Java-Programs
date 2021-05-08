class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> sol = new ArrayList<>();
        BFS(root,sol);
        return sol;
        }
    private  static void BFS(TreeNode root,List<List<Integer>> sol){
        if(root==null)return;
        Deque<TreeNode> q=new ArrayDeque<>();
        q.addLast(root);
        while(!q.isEmpty()){
            List<Integer> subsol=new ArrayList<>();
            int qlen=q.size();
            for(int i=0;i<qlen;i++){
                TreeNode curr=q.removeFirst();
                subsol.add(curr.val);
                if(curr.left!=null){
                    q.addLast(curr.left);
                }
                if(curr.right!=null){
                    q.addLast(curr.right);
                }
            }
           sol.add(subsol); 
        }
       
        
    }
}
