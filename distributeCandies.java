class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> types= new HashSet<Integer>();
        int size= candyType.length;
        for(int i=0;i<size;i++){
            types.add(candyType[i]);
        }
      return Math.min(types.size(),size/2);
        
    }
}
