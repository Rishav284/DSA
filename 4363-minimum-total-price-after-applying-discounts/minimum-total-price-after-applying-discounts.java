class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int r1= prices.length-1;
        int r2= discounts.length-1;
        double sum=0;
        while(r1>=0 && r2>=0){
            sum+= (double) (prices[r1] * (100 - discounts[r2])) /100;
            r1--;
            r2--;
        }
        while (r1>=0) sum+=prices[r1--];
        return sum;
    }
}