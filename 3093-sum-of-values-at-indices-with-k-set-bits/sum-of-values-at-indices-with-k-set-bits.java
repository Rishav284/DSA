class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int ans=0;
        for(int i=0;i<nums.size();i++){
            if(setBits(i)==k) ans+=nums.get(i);
        }
        return ans;
    }
    static int setBits(int a){
        int n=0;
        while(a>0){
            if((a&1)==1) n++;
            a=a>>1;
        }
        return n;
    }
}