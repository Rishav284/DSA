class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        int[] numsD=new int[n];
        for(int i=0;i<n;i++) numsD[i]=Math.abs(nums[i]);
        Arrays.sort(numsD);
        long ans=0;
        for(int i=n-1;i>=(int) Math.ceil(n/2);i--){
            ans+=(numsD[i]*numsD[i]);
        }
        for(int i=0;i<(int) Math.ceil(n/2);i++){
            ans-=(numsD[i]*numsD[i]);
        }
        return ans;
    }
}