class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,Comparator.comparingInt(row->row[0]));
        LinkedList<int[]> arr=new LinkedList<>();
        for(int[] interval:intervals){
            if(arr.isEmpty() || interval[0]>arr.getLast()[1]){
                arr.add(interval);
            }
            else{
                arr.getLast()[1]=Math.max(arr.getLast()[1],interval[1]);
            }
        }
        int[][] sol=arr.toArray(new int[arr.size()][]);
        return sol;
        
    }
}
