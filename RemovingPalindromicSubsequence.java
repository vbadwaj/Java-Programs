class Solution {
    public int removePalindromeSub(String s) {
        if(s.length()==0)return 0;
        return isPalindrome(s)?1:2;
        
    }
    public static boolean isPalindrome(String s){
        boolean flag=true;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                flag=false;
                break;
            }
        }
        return flag?true:false;
    }
}
