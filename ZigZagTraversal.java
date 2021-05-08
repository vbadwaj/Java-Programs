class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> sol=new ArrayList<>();
        BFS(root,sol,0);
        return sol;
        }
    private static void BFS(TreeNode root,List<List<Integer>> sol,int level){
        if(root==null)return;
        Deque<TreeNode> q=new ArrayDeque<>();
        q.add(root);
        
        while(!q.isEmpty()){
           List<Integer> subsol=new ArrayList<>();
           int qlen=q.size();
            for(int i=0;i<qlen;i++){
                TreeNode curr=q.poll();
                subsol.add(curr.val);
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            if(level%2==0){
                sol.add(subsol);
            }
            
            else{
                Collections.reverse(subsol);
                sol.add(subsol);
            } 
            level++;
        }
        
    }
}
