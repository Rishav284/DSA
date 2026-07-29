class Solution {
    public int maximumXOR(int[] nums) {
        
        //to count frequency of ith bit
        int count[]=new int[32];
        
        for(int num:nums){
            for(int i=0; i<32;i++){
                 count[i] += num>>i&1;
             }
        }
        
        int ans = 0;
        for(int i=0; i<32; i++){
            //if count of ith bit is greater than 0, we can make xor = 1, so it can contribute to solution
            if(count[i]>0)
            ans |= 1<<i;
        }
        return ans;
    }
}