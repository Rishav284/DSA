class Solution {
    public int minimumSum(int num) {
        int[] n=new int[4];
        n[0]=num%10;
        num/=10;
        n[1]=num%10;
        num/=10;
        n[2]=num%10;
        num/=10;
        n[3]=num;
        Arrays.sort(n);
        int a=n[0]*10+n[3];
        int b=n[1]*10+n[2]; 
        return a+b;
    }
}