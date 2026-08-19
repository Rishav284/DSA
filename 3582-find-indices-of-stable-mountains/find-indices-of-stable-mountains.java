class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        int n=height.length;
        List<Integer> ans=new ArrayList<>();
        for(int i=n-1;i>=0;i--){
            if(i>0 && height[i-1]>threshold) ans.add(i);
        }
        return ans;
    }
}