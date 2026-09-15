class Solution {
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
        ans[0]=0;
        int lastPow=1;
        for(int i=1;i< ans.length;i++){
            if((i&1)==1) ans[i]=ans[i-1]+1;
            else if((i & (i - 1))== 0) {
                lastPow=i;
                ans[i]=1;
            }
            else{
                ans[i]=1+ans[i-lastPow];
            }
        }
        return ans;
    }
}