class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        int[] freq=new int[51];
        int max=0;
        for(int i=0;i<n;i++){
            freq[nums[i]]++;
            max=Math.max(max,nums[i]);
        }
        if(k==n) return max;
        else if(k==1){
            while(max>=0 && freq[max]!=1) max--;
            if(max>=0) return max;
        }
        else if(k<nums.length){
            int m1=Math.max(nums[0],nums[n-1]);
            int m2=Math.min(nums[0],nums[n-1]);
            if(freq[m1]==1) return m1;
            else if(freq[m2]==1) return m2;
        }
        return -1;
    }
}