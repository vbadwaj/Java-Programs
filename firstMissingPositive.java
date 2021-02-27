class Solution {
    public int firstMissingPositive(int[] nums) {
        int[] hash= new int[nums.length+1];
        hash[0]=-999;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=nums.length && nums[i]>0){
                hash[nums[i]]=nums[i];
            }
        }
        for(int i:hash){
        System.out.println(i);
        }
        for(int i=0;i<nums.length+1;i++){
            if(hash[i]==0) return i;
        }
        
        
        return hash[0] == 0 ? nums.length : nums.length + 1;
        
    }
}
