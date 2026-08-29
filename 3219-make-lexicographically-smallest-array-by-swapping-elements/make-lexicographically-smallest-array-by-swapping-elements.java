class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;
        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) idx[i] = i;
        Arrays.sort(idx, (a, b) -> nums[a] - nums[b]);

        int[] result = new int[n];
        int i = 0;
        while (i < n) {
            int j = i;
            // extend the group while consecutive sorted values stay within limit
            while (j + 1 < n && nums[idx[j + 1]] - nums[idx[j]] <= limit) {
                j++;
            }
            int size = j - i + 1;
            int[] positions = new int[size];
            for (int k = 0; k < size; k++) positions[k] = idx[i + k];
            Arrays.sort(positions); // original indices in this group, ascending
            for (int k = 0; k < size; k++) {
                result[positions[k]] = nums[idx[i + k]]; // smallest value -> smallest index
            }
            i = j + 1;
        }
        return result;
    }
}