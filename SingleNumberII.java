class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length < 3)return nums[0];
        int i=0;
        int j=2;
        int len=nums.length;
        Arrays.sort(nums);
        while(j<nums.length){
            if(nums[i]!=nums[j]){
               return nums[i];
            }
            else{   
                i=i+3;
                j=j+3;
            }
        }
        return nums[i];
    }
}

