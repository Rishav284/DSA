class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int n=nums.length;
        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> ds=new ArrayList<>();
        backtrack1(0,nums,ds,ans);
        return ans;
    }
    static void backtrack1(int currInd,int[] nums,ArrayList<Integer> ds,List<List<Integer>> ans){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=currInd;i<nums.length;i++){
            swap(currInd,i,nums);
            ds.add(nums[currInd]);
            backtrack1(currInd+1,nums,ds,ans);
            ds.remove(ds.size()-1);
            swap(i,currInd,nums);
        }
    }
    static void swap(int l,int r,int[] nums){
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
    }
}