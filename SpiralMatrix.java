class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        int startrow=0;
        int endrow=rows-1;
        int startcol=0;
        int endcol=cols-1;
        List<Integer> sol=new ArrayList<>();
        while(startrow<=endrow && startcol<=endcol){
            for(int i=startcol;i<=endcol;i++){
                sol.add(matrix[startrow][i]);
            }
            for(int i=startrow+1;i<=endrow;i++){
                sol.add(matrix[i][endcol]);
            }
            if(endrow>startrow && endcol>startcol){
                for(int i=endcol-1;i>=startcol;i--){
                    sol.add(matrix[endrow][i]);
                }
                for(int i=endrow-1;i>startrow;i--){
                    sol.add(matrix[i][startcol]);
                }
            }
            startrow++;
            endcol--;
            endrow--;
            startcol++;
        }
        return sol;
    }
}
