class Solution {
    public int alternatingSum(int[] nums) {
       int n=nums.length;
       int odd=0;
       int even=0;
       for(int l=0,r=1;l<n || r<n; l+=2,r+=2){
        if(l<n) even+=nums[l];
        if(r<n) odd+=nums[r];
       } 
       return even-odd;
    }
}