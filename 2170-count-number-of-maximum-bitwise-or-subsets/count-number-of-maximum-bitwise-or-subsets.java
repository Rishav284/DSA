class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int OR=0;
        for (int num : nums) OR |= num;
        return countSubset(nums,OR,0,0);
    }
    static int countSubset(int[] nums,int OR,int ind,int curr){
        if(ind==nums.length){
            if(curr==OR) return 1;
            return 0;
        }
        int pick=countSubset(nums,OR,ind+1,curr|nums[ind]);
        int notPick=countSubset(nums,OR,ind+1,curr);
        return pick+notPick;
    }
}