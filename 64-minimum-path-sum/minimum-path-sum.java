class Solution {
    public int minPathSum(int[][] grid){
        int m= grid.length;
        int n= grid[0].length;
        int[] prev=new int[n];
        for (int i=0;i<m;i++){
            int[] temp=new int[n];
            for(int j=0;j<n;j++){
                if(i==0 && j==0) {
                    temp[j]=grid[i][j];
                    continue;
                }
                int down=Integer.MAX_VALUE;
                int right=Integer.MAX_VALUE;
                if(i>0) down=prev[j];
                if(j>0) right=temp[j-1];
                temp[j]=grid[i][j]+Math.min(down,right);
            }
            prev=Arrays.copyOf(temp,n);
        }
        return prev[n-1];
    }
}