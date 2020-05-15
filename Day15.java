class Solution {
    public int maxSubarraySumCircular(int[] A) {
        int maxSum = Integer.MIN_VALUE, minSum = Integer.MAX_VALUE, xMax = 0, xMin = 0, total = 0, i;
        for(i = 0; i < A.length; i++){
            xMax = m1(xMax + A[i], A[i]);
            xMin = m2(xMin + A[i], A[i]);
            maxSum = m1(maxSum, xMax);
            minSum = m2(minSum, xMin);
            total += A[i];
        }
        if(maxSum > 0)
            return m1(maxSum, total - minSum);
        return maxSum;
    }
    int m1(int x, int y){
        return x > y ? x : y;
    }
    int m2(int x, int y){
        return x < y ? x : y;
    }
}
