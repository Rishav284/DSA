class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n=nums.length;
        int l=0,r=0;
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(r<n){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            if(map.get(nums[r])>k){
                while(map.get(nums[r])>k){
                    map.put(nums[l],map.getOrDefault(nums[l],0)-1);
                    if(map.get(nums[l])==0) map.remove(nums[l]);
                    l++;
                }
            }
            ans=Math.max(ans,r-l+1);
            r++;
        }
        return ans;
    }
}