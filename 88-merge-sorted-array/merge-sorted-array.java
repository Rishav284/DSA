class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=m-1,j=nums1.length-1;i>=0;i--,j--){
            int temp=nums1[j];
            nums1[j]=nums1[i];
            nums1[i]=temp;
        }
        int n1=n,n2=0,p=0;
        while(n1<nums1.length && n2<n){
            if(nums1[n1]<=nums2[n2]){
                int temp=nums1[p];
                nums1[p]=nums1[n1];
                nums1[n1]=temp;
                n1++;
            }else{
                int temp=nums1[p];
                nums1[p]=nums2[n2];
                nums2[n2]=temp;
                n2++;
            }
            p++;
        }
        while(n2<n && p< nums1.length) nums1[p++]=nums2[n2++];
    }
}