class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> m=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            m.add(nums[i]);
        }
        return m.size()<nums.length;
    }
}