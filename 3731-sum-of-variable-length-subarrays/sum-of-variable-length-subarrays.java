class Solution {
    public int subarraySum(int[] nums){
        int n=nums.length;
        int[] prefixSum=new int[n];
        prefixSum[0]=nums[0];
        int ans=nums[0];
        for(int i=1;i<n;i++){
            prefixSum[i]+=(prefixSum[i-1]+nums[i]);
            int start=Math.max(0,i-nums[i]);
            if(start>0) ans+=(prefixSum[i]-prefixSum[start-1]);
            else ans+=(prefixSum[i]);
        }
        return ans;
    }
}