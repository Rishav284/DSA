class Solution {
    public int minDeletions(int[] a) {
        int n=a.length;
        int count=0;
        for(int i=1;i<n;i++){
            while(i<n && a[i-1]==a[i]){
                i++;
                count++;
            }
        }
        return count;
    }
}