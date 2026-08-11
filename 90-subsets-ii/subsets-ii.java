class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> sums = new ArrayList<>();
        List<Integer> sum = new ArrayList<>();
        for (int mask = 0; mask < (1 << n); mask++) {
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    sum.add(nums[i]);
                }
            }
            if(!sums.contains(sum)) sums.add(new ArrayList<>(sum));
            sum.clear();
        }
        return sums;
    }
}