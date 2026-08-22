class Solution {
    public boolean checkDivisibility(int n) {
        int a=n;
        int sum=0;
        int prod=1;
        while(a>0){
            int rem=a%10;
            sum+=rem;
            prod*=rem;
            a/=10;
        }
        return n%(sum+prod)==0;
    }
}