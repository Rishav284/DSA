class Solution {
    public int maximumGap(int[] nums) {
        int n = nums.length;
        if (n < 2) return 0;
 
        int lo = Integer.MAX_VALUE, hi = Integer.MIN_VALUE;
        for (int x : nums) {
            lo = Math.min(lo, x);
            hi = Math.max(hi, x);
        }
        if (lo == hi) return 0;
 
        // Bucket size and count (pigeonhole setup)
        int bucketSize = Math.max(1, (hi - lo) / (n - 1));
        int bucketCount = (hi - lo) / bucketSize + 1;
 
        int[] bucketMin = new int[bucketCount];
        int[] bucketMax = new int[bucketCount];
        Arrays.fill(bucketMin, Integer.MAX_VALUE);
        Arrays.fill(bucketMax, Integer.MIN_VALUE);
 
        for (int x : nums) {
            int idx = (x - lo) / bucketSize;
            bucketMin[idx] = Math.min(bucketMin[idx], x);
            bucketMax[idx] = Math.max(bucketMax[idx], x);
        }
 
        // Walk buckets, comparing max of previous non-empty bucket to min of current
        int maxGap = 0;
        int prevMax = lo;
        for (int i = 0; i < bucketCount; i++) {
            if (bucketMin[i] == Integer.MAX_VALUE) continue; // empty bucket
            maxGap = Math.max(maxGap, bucketMin[i] - prevMax);
            prevMax = bucketMax[i];
        }
        return maxGap;
    }
}