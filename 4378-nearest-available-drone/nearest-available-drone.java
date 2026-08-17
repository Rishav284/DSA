class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int n = drones.length;
        int minInd=-1;
        int currRange=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int dist=Math.abs(drones[i][0]-target[0])+Math.abs(drones[i][1]-target[1]);
            if(dist<=drones[i][2] && dist<currRange){
                currRange=dist;
                minInd=i;
            }
        }
        return minInd;
    }
}