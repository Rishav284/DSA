class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
        int n=arrivalTime.length;
        Arrays.sort(lights);
        int ans=0;
        for(int i=0;i<n;i++){
            int r=arrivalTime[i]%period;
            if(r>=lights[lights.length-1]) {
                r=period-r;
                ans=Math.max(ans,r);
            }
        }
        return ans;
    }
}