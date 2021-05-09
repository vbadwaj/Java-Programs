class Solution {
    public int maximumPopulation(int[][] logs) {
        int minyear=Integer.MAX_VALUE;
        int maxpop=Integer.MIN_VALUE;
        Map<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<logs.length;i++){
            for(int j=logs[i][0];j<logs[i][1];j++){
                if(!hash.containsKey(j)){
                    hash.put(j,1);
                }
                else{
                    hash.put(j,hash.get(j)+1);
                }
            }
            
        }
        for(int k:hash.keySet()){
            if(hash.get(k)==maxpop){
               minyear=Math.min(minyear,k);
                }
            else if(hash.get(k)>maxpop){
                maxpop=Math.max(maxpop,hash.get(k));
                minyear=k;
            }
        }
        return minyear;     
    }
}
