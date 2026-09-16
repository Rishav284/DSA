class Solution {
    public int rob(int[] nums) {
        int[] dp =new int[nums.length];
        Arrays.fill(dp,-1);
        return solve(nums,0,dp);
    }
    static int solve(int[] arr,int i,int[] dp) {
        if (i>=arr.length) return 0;
        if (dp[i]!=-1) return dp[i];
        int take=arr[i] + solve(arr,i+2,dp);
        int skip=solve(arr,i+1,dp);
        return dp[i]=Math.max(take,skip);
    }
}