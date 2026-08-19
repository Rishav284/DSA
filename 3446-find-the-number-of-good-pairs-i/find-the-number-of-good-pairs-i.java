class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int n=nums1.length;
        int m=nums2.length;
        int pairs=0;
        for (int j : nums2) {
            int val = j * k;
            for (int value : nums1) {
                if (value % val == 0) pairs++;
            }
        }
        return pairs;
    }
}