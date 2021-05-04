class Solution
{
    static int numOfWays(int n, int x)
    {
        return calculate(n,x,1);
    }
    static int calculate(int n,int x,int it){
        int power=(int)(n-(Math.pow(it,x)));
        if(power==0)return 1;
        if(power<0)return 0;
        else{
            return calculate(power,x,it+1) + calculate(n,x,it+1);
            
        }
    }
    
}
