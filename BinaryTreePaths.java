class Solution {
    List<String> sol=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if(root.left==null && root.right==null){
            sol.add(""+root.val);
            return sol;
        }
        String rootval=String.valueOf(root.val);
        if(root.right!=null)
        paths(rootval,root.right);
        if(root.left!=null)
        paths(rootval,root.left);
        return sol;
    }
    private void paths(String collective,TreeNode root){
        if(root.right==null && root.left==null){
            collective+="->"+root.val;
            sol.add(collective);
            return;
        }
        collective+="->"+root.val;
        if(root.right!=null){
            paths(collective,root.right);
            }
        if(root.left!=null){
           paths(collective,root.left);
        }
        
    }
}
