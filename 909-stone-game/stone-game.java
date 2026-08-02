class Solution {
    public boolean stoneGame(int[] piles) {
        int maxA=0;
        int maxB=0;
        int l=0;
        int r=piles.length-1;
        Arrays.sort(piles);
        for(int i=piles.length-2;i>=0 && r>=0;i-=2,r-=2){
            maxA+=piles[r];
            maxB+=piles[i];
        }
        return maxA>maxB;
    }
}