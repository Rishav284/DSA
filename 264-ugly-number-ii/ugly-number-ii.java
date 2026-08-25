class Solution {
    public int nthUglyNumber(int n) {
        int[] ugly = new int[n];
        ugly[0] = 1;
 
        int p2 = 0, p3 = 0, p5 = 0; // pointers into 'ugly', indicating which
                                     // already-found ugly number to multiply next
 
        for (int i = 1; i < n; i++) {
            int next2 = ugly[p2] * 2;
            int next3 = ugly[p3] * 3;
            int next5 = ugly[p5] * 5;
 
            int nextUgly = Math.min(next2, Math.min(next3, next5));
            ugly[i] = nextUgly;
 
            // advance every pointer whose candidate was just used
            // (use if, not else-if, to correctly skip duplicates like 6 = 2*3 = 3*2)
            if (nextUgly == next2) p2++;
            if (nextUgly == next3) p3++;
            if (nextUgly == next5) p5++;
        }
 
        return ugly[n - 1];
    }
}