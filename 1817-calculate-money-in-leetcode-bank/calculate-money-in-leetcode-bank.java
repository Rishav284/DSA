class Solution {
    public int totalMoney(int n) {
        int mon=1;
        int day=1;
        int cost=0;
        int i=0;
        while(day<=n){
            day++;
            cost+=(mon+i);
            if(i==6){
                mon++;
                i=0;
            }
            else i++;
        }
        return cost;
    }
}