class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> sol=new ArrayList<>();
        for(int i=0;i<(1<<nums.length);i++){
            List<Integer> subsol=new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                  if((i & (1 << j))>0){
                      //Check if the jth bit in i is set 
                      subsol.add(nums[j]);
                  }
            }
            sol.add(subsol);
        }
        return sol;
    }
}

