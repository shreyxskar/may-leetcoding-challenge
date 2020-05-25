class Solution {
    public int maxUncrossedLines(int[] A, int[] B) {
        int dp[][] = new int[A.length + 1][B.length + 1];
        int i = 1, j = 1;
        for(i = 1; i < dp.length; i++)
            for(j = 1; j < dp[i].length; j++)
                dp[i][j] = A[i-1] == B[j-1] ? 1 + dp[i-1][j-1] : Math.max(dp[i-1][j], dp[i][j-1]);
        return dp[i-1][j-1];
    }
}
