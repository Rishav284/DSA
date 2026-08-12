class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int n=nums.length;
        List<List<Integer>> ans=new ArrayList<>();
        boolean[] taken= new boolean[n];
        Arrays.fill(taken,false);
        ArrayList<Integer> ds=new ArrayList<>();
        backtrack(ans,nums,taken,ds);
        return ans;
    }
    static void backtrack(List<List<Integer>> ans,int[] nums,boolean[] taken,ArrayList<Integer> ds){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!taken[i]){
                taken[i]=true;
                ds.add(nums[i]);
                backtrack(ans,nums,taken,ds);
                taken[i]=false;
                ds.remove(ds.size()-1);
            }
        }
    }
}