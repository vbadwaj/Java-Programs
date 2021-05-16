class Solution {
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            count+=expand(s,i,i);//palindromes of the form WCW
            count+=expand(s,i,i+1);//palindromes of the form WW
        }
        return count;
    }
    private int expand(String s,int start,int end){
        
        int len=0;
        while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end)){
            len++;
            start--;
            end++;
        }
        return len;
    }
}
