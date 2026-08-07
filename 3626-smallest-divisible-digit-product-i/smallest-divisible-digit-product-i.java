class Solution {
    public int smallestNumber(int n, int t) {
        while(!isDivisible(n,t)) n++;
        return n;
    }
    boolean isDivisible(int n,int t){
        String s=String.valueOf(n);
        int a=1;
        for(int i=0;i<s.length();i++){
            int val=Integer.valueOf(s.charAt(i))-'0';
            a*=val;
        }
        return a%t==0;
    }
}