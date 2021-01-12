class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sol=new StringBuilder();
        int carry=0;
        int aSize=a.length()-1,bSize=b.length()-1;
        while(aSize>=0||bSize>=0){
            int flag=carry;
            if(aSize==-1)flag+=b.charAt(bSize--)-'0';
            else if (bSize==-1)flag+=a.charAt(aSize--)-'0';
            else flag+=b.charAt(bSize--)-'0'+a.charAt(aSize--)-'0';
           carry=0;
            if(flag>=2){
                carry=1;
                flag=flag-2;
            }
            sol.insert(0,flag);
        }
        if(carry==1)sol.insert(0,'1');
        return sol.toString();
        
    }
}
