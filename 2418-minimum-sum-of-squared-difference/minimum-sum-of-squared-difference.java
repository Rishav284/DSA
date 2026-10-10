class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        int k = k1 + k2;
        int[] diff = new int[n];
        int maxDiff = 0;
        long totalDiff = 0;
        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            maxDiff = Math.max(maxDiff, diff[i]);
            totalDiff += diff[i];
        }
        if (k >= totalDiff) {
            return 0;
        }
        int[] freq = new int[maxDiff + 1];
        for (int d : diff) {
            freq[d]++;
        }
        for (int d = maxDiff; d > 0 && k > 0; d--) {
            if (k >= freq[d]) {
                k -= freq[d];
                freq[d - 1] += freq[d];
                freq[d] = 0;
            } else {
                freq[d - 1] += k;
                freq[d] -= k;
                k = 0;
            }
        }
        long sum = 0;
        for (int d = 1; d < freq.length; d++) {
            sum += (long) d * d * freq[d];
        }
        return sum;
    }
}