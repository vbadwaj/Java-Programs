class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums==null||nums.length==0)return null;
        int len=nums.length;
        TreeNode sol=toTree(nums,0,len-1);
        return sol;
        }
    private TreeNode toTree(int[] nums,int start,int end){
        if(start>end){
            return null;
        }
        
        int mid=(start+end)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=toTree(nums,start,mid-1);
        root.right=toTree(nums,mid+1,end);
        
        return root;
    }
}
