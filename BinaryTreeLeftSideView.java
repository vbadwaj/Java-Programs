class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        Deque<TreeNode> q=new ArrayDeque<>();
        List<Integer> sol=new ArrayList<>();
        if(root==null)return sol;
        q.add(root);
        while(!q.isEmpty()){
            int len=q.size();
            for(int i=0;i<len;i++){
                TreeNode curr=q.remove();
                if(i==0){
                    sol.add(curr.val);
                }
               
                if(curr.left!=null){
                    q.add(curr.left);
                }
                 if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
        return sol;
    }
}
