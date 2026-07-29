class Solution {
    public int earliestTime(int[][] tasks) {
        int earliest=200;
        for(int i=0;i<tasks.length;i++){
            earliest=Math.min(earliest,tasks[i][0]+tasks[i][1]);
        }
        return earliest;
    }
}