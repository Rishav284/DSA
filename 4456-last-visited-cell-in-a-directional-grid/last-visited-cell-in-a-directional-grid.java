class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int m= grid.length;
        int n=grid[0].length;
        boolean[][] visited=new boolean[m][n];
        for(int i=0;i<m;i++) Arrays.fill(visited[i],false);
        int r=0;
        int c=0;
        int[] ans=new int[2];
        while(r<m && r>-1 && c<n && c>-1 && !visited[r][c]){
            visited[r][c]=true;
            ans[0]=r;
            ans[1]=c;
            char ch=grid[r][c];
            if(ch=='R') c+=1;
            else if(ch=='L') c-=1;
            else if(ch=='U') r-=1;
            else if(ch=='D') r+=1;
        }
        return ans;
    }
}