class Solution {
    public String intToRoman(int num) {
        int[] nums={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] chars={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int i=0;
        String sol="";
        while(num>0){
            if(num-nums[i]<0){
                i++;
                continue;
            }
            else{
                sol+=chars[i];
                num-=nums[i];
            }
        }
        return sol;
        
    }
}
