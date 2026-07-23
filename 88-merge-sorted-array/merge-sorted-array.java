class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l=0;int r=0;
        while (r<n){
            nums1[m+r]=nums2[r];
            r++;
        }
        Arrays.sort(nums1);
    }
}