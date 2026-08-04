class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int l=nums[0];
        List<Integer> a=new ArrayList<>();
        int i=0;
        while(i<nums.length && l<nums[nums.length-1]){
            if(nums[i]!=l){
                a.add(l);
                l++;
            }else {
                i++;
                l++;
            }
        }
        return a;
    }
}