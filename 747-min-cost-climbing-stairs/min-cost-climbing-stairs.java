class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int min2=cost[0];
        int min1=cost[1];
        for(int i=2;i<cost.length;i++){
            int temp=cost[i]+Math.min(min1,min2);
            min2=min1;
            min1=temp;
        }
        return Math.min(min1,min2);
    }
}