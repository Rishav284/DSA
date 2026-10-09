class Solution {
    public int smallestIndex(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(isEqual(nums[i],i)) return i;
        }
        return -1;
    }
    static boolean isEqual(int n,int a){
        int sum=0;
        while(n>0){
            sum+=(n%10);
            n/=10;
        }
        return sum==a;
    }
}