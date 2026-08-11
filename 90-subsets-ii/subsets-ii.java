class Solution {
     public void findSubsets(int ind, int[] nums, List<Integer> ds, Set<List<Integer>> result) {
        if (ind == nums.length) {
            result.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[ind]);
        findSubsets(ind + 1, nums, ds, result);
        ds.remove(ds.size() - 1);
        findSubsets(ind + 1, nums, ds, result);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        findSubsets(0, nums, new ArrayList<>(), result);
        return new ArrayList<>(result);
    }
}