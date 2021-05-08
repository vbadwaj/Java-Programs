class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> sol=new ArrayList<>();
        BFS(root,sol);
        Collections.reverse(sol);
        return sol;
        
    }
    private static void BFS(TreeNode root,List<List<Integer>> sol){
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
            
                sol.add(subsol);
        }
        
    }
}
