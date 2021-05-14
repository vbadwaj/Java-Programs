class Solution {
    public int countPrimes(int n) {
        if(n<=1)return 0;
        boolean[] prime=new boolean[n];
        Arrays.fill(prime,true);
        for(int num=2;num*num<n;num++){
            if(prime[num]==true){
                for(int i=num*num;i<n;i+=num){
                    prime[i]=false;
                }
            }
            
        }
        int count=0;
        for(int i=2;i<n;i++){
            if(prime[i])count++;
        }
        return count;
    }

}
