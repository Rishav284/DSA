class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int n=nums.length;
        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> ds=new ArrayList<>();
        backtrack1(0,nums,ans);
        return ans;
    }
    static void backtrack1(int currInd,int[] nums,List<List<Integer>> ans){
        if(currInd==nums.length){
            List<Integer> ds=new ArrayList<>();
            for (int num : nums) {
                ds.add(num);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=currInd;i<nums.length;i++){
            swap(currInd,i,nums);
            backtrack1(currInd+1,nums,ans);
            swap(i,currInd,nums);
        }
    }
    static void swap(int l,int r,int[] nums){
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
    }
}