class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        return minimumPathSum(triangle,triangle.size());
    }
    static int minimumPathSum(List<List<Integer>> triangle, int n) {
        // Create dp array
        int[][] dp = new int[n][n];

        // Fill last row
        for (int j = 0; j < n; j++) {
            dp[n - 1][j] = triangle.get(n - 1).get(j);
        }

        // Fill rest of dp from bottom to top
        for (int i = n - 2; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                // Take min of down and diagonal
                int down = triangle.get(i).get(j) + dp[i + 1][j];
                int diag = triangle.get(i).get(j) + dp[i + 1][j + 1];
                dp[i][j] = Math.min(down, diag);
            }
        }

        // Return top element
        return dp[0][0];
    }

}