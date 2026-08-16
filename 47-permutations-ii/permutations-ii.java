class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] taken = new boolean[n];
        ArrayList<Integer> ds = new ArrayList<>();
        backtrack(ans, nums, taken, ds);
        return ans;
    }

    static void backtrack(List<List<Integer>> ans, int[] nums, boolean[] taken, ArrayList<Integer> ds) {
        if (ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (taken[i]) continue;
            if (i > 0 && nums[i] == nums[i - 1] && !taken[i - 1]) continue;
            taken[i] = true;
            ds.add(nums[i]);
            backtrack(ans, nums, taken, ds);
            taken[i] = false;
            ds.remove(ds.size() - 1);
        }
    }
}