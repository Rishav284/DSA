class Solution {
    public int fib(int n) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0; i<=n; i++) {
            a.add(-1);
        }
        return fibonacciDp(n,a);
    }
    static int fibonacciDp(int n, ArrayList<Integer> dp){
        if(n<=1) {
            return n;
        }
        if(n<dp.size() && dp.get(n)!=-1) {
            return dp.get(n);
        }
        dp.set(n, fibonacciDp(n - 1, dp) + fibonacciDp(n - 2, dp));
        return dp.get(n);
    }
}