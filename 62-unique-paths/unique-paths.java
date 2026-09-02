class Solution {
    public int uniquePaths(int m, int n) {
        int cR=m;
        int cC=n;
        int[][] dp=new int[m][n];
        return memoization(cR,cC,m,n,dp);
    }

    static int memoization(int r,int c,int m,int n,int[][] dp){
        if(r==1 && c==1){
            return 1;
        }
        if(dp[r-1][c-1]!=0) return dp[r-1][c-1];
        int down=0;
        int right=0;
        if(r>1) down=memoization(r-1,c,m,n,dp);
        if(c>1) right=memoization(r,c-1,m,n,dp);
        return dp[r-1][c-1]=down+right;
    }
}