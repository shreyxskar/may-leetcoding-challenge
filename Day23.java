class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        if(A.length == 0 || B.length == 0)
            return new int[0][0];
        ArrayList<int[]> al = new ArrayList<>();
        int i = 0, j = 0, k = 0;        
        while(i < A.length && j < B.length){
            if(A[i][1] < B[j][0])
                i++;
            else if(B[j][1] < A[i][0])
                j++;
            else{
            int idx0 = Math.max(A[i][0], B[j][0]);
            int idx1 = Math.min(A[i][1], B[j][1]);       
            al.add(new int[]{idx0, idx1});    
            if(idx1 == A[i][1])
                i++;
            else
                j++;
            }
        }
        int res[][] = new int[al.size()][2];
        for(int r[]: al){
            res[k][0] = r[0];
            res[k++][1] = r[1];            
        }
        return res;
    }
}
