class Solution {
    public int countPartitions(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int ans=0;
        int currSum=0;
        for(int i=0;i<n-1;i++){
            currSum+=nums[i];
            if(Math.abs((sum-currSum)-currSum)%2==0) ans++;
        }
        return ans;
    }
}