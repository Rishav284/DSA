class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int[] ans=new int[2*n];
        int l=n-1;
        int r=n;
        while(l>=0){
            ans[l]=nums[l];
            ans[r]=nums[l];
            l--;
            r++;
        }
        return ans;
    }
}