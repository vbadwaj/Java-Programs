class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)return nums[0];
        int houses=nums.length;
        return Math.max(find(nums,0,houses-1),find(nums,1,houses));    
    }
    private int find(int[] nums,int start,int end){
        int even=0;
        int odd=0;
        for(int i=start;i<end;i++){
            if(i%2==0){
                even=Math.max(odd,even+nums[i]);
            }
            else odd=Math.max(even,odd+nums[i]);
        }
        return Math.max(even,odd);
    }
}
