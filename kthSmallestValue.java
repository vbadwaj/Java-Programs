//Queue implementation
class Solution {
    int min=Integer.MIN_VALUE;
    public int kthSmallest(TreeNode root, int k) {
        Deque<TreeNode> q=new ArrayDeque<>();
        q.add(root);
        List<Integer> subsol=new ArrayList<>();
        while(!q.isEmpty()){
            int size=q.size();
            TreeNode curr=q.remove();
            subsol.add(curr.val);
            for(int i=0;i<size;i++){
                if(curr.right!=null){
                    q.add(curr.right);
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }
            }
        }
        Collections.sort(subsol);
        return subsol.get(k-1);
        
        
    }
}
//inorder traversal Here the nodes are already in a sorted order
class Solution {
    List<Integer> subsol=new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        inorder(root);
        return subsol.get(k-1);
        }
    private void inorder(TreeNode root){
        if(root==null)return;
        inorder(root.left);
        subsol.add(root.val);
        inorder(root.right);
    }
}


