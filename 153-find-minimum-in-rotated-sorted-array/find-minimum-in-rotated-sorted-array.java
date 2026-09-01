class Solution {
    public int findMin(int[] nums) {
    int start = 0;
    int end = nums.length - 1;
    while (start < end) {
        int mid = start + (end - start) / 2;
        if (nums[mid] > nums[end]) {
            // min is somewhere to the right of mid
            start = mid + 1;
        } else {
            // nums[mid] <= nums[end] means mid could BE the min,
            // so keep it in range instead of excluding it
            end = mid;
        }
    }
    return nums[start]; // start == end here, pointing at the minimum
}
}