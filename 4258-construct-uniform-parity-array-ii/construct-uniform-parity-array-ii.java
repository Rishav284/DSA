class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
        boolean allOdd=true;
        boolean allEven=true;
        long min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if((nums1[i]&1)==0) allOdd=false;
            else if((nums1[i]&1)==1) allEven=false;
            if(nums1[i]<min) min=nums1[i];
        }
        if(allEven || allOdd || (min&1)==1) return true;
        return false;
    }
}