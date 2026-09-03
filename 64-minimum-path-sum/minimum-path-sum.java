class Solution {
    public int minPathSum(int[][] grid) {
        int r= grid.length;
        int c= grid[0].length;
        int[][] dp=new int[r][c];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return memoization(r-1,c-1,grid,dp);
    }
    static int memoization(int currRow,int currCol,int[][] grid,int[][] dp){
        if(currRow==0 && currCol==0){
            return grid[0][0];
        }
        if(dp[currRow][currCol]!=-1) return dp[currRow][currCol];
        int down=Integer.MAX_VALUE;
        int right=Integer.MAX_VALUE;
        if(currRow>0) down=memoization(currRow-1,currCol,grid,dp);
        if(currCol>0) right=memoization(currRow,currCol-1,grid,dp);
        return dp[currRow][currCol]=grid[currRow][currCol]+Math.min(down,right);
    }
}