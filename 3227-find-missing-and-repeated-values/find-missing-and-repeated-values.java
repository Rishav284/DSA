class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int[] freq=new int[n*n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                freq[grid[i][j]-1]++;
            }
        }
        int repeated=-1;
        int missing=-1;
        for(int i=0;i<freq.length;i++){
            if(freq[i]==0) missing=i+1;
            if(freq[i]>1) repeated=i+1;
        }
        return new int[]{repeated,missing};
    }
}