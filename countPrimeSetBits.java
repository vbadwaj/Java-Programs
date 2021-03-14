class Solution {
    public int countPrimeSetBits(int L, int R) {
        int fcount=0;
        for(int i=L;i<=R;i++){
            String a= Integer.toBinaryString(i);
            if(isPrime(a)){ 
                fcount+=1;
            }
        }
        return fcount;
    }
    public boolean isPrime(String a){
        int count=0,flag=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='1'){
            count++;
            }
        }
     
        if(count ==1 || count==0)return false;
        for(int i=2;i<=count/2;i++){
            if(count%i==0){
                flag=1;
                break;
            }
            else flag=0; 
        }
        if(flag==0)return true;
         return false;
    }
}
