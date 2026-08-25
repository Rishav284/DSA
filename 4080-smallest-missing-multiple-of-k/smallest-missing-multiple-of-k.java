class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for (int num : nums) set.add(num);
        int i=1;
        int ans=0;
        while (true){
            if(!set.contains(k*i)){
                ans=k*i;
                break;
            }
            i++;
        }
        return ans;
    }
}