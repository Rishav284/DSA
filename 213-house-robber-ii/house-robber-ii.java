class Solution {
    public int rob(int[] nums){
        if(nums.length==1) return nums[0];
        int prev2 = 0;
        int prev = nums[0];
        // Traverse through the array
        for (int i = 1; i < nums.length-1; i++) {
            // Include current by adding it to two steps back
            int include = nums[i] + prev2;
            // Exclude current by taking previous best
            int exclude = prev;
            // Choose max of include and exclude
            int curr = Math.max(include, exclude);
            // Update tracking variables
            prev2 = prev;
            prev = curr;
        }
        int max1=prev;
        prev2 = 0;
        prev = nums[1];
        // Traverse through the array
        for (int i = 2; i<nums.length; i++) {
            // Include current by adding it to two steps back
            int include = nums[i] + prev2;
            // Exclude current by taking previous best
            int exclude = prev;
            // Choose max of include and exclude
            int curr = Math.max(include, exclude);
            // Update tracking variables
            prev2 = prev;
            prev = curr;
        }
        return Math.max(max1,prev);
    }
}