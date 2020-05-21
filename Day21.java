class Solution {
    public int countSquares(int[][] matrix) {
        int count = 0;
        int i, j;
        for(i = 0; i < matrix.length; i++)
            if(matrix[i][0] == 1)
                count += 1;
        for(j = 1; j < matrix[0].length; j++)
            if(matrix[0][j] == 1)
                count += 1;
        for(i = 1; i < matrix.length; i++){
            for(j = 1; j < matrix[i].length; j++){
                if(matrix[i][j] != 0){
                    int min = Math.min(Math.min(matrix[i-1][j-1], matrix[i-1][j]), matrix[i][j-1]) + 1;
                    count += min;
                    matrix[i][j] = min;
                }
            }
        }
        return count;
    }
}
