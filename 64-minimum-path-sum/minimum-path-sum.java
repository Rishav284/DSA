class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[] dp = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    dp[j] = grid[i][j];
                    continue;
                }
                int down = (i > 0) ? dp[j] : Integer.MAX_VALUE;
                int right = (j > 0) ? dp[j-1] : Integer.MAX_VALUE;
                dp[j] = grid[i][j] + Math.min(down, right);
            }
        }
        return dp[n-1];
    }
}