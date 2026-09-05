class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        if (s.charAt(0) == '0') return 0;

        int curr = (s.charAt(n - 1) != '0') ? 1 : 0; // dp[n-1]
        int prev = 1;                                 // dp[n], base case

        for (int i = n - 2; i >= 0; i--) {
            int val = Integer.parseInt(s.substring(i, i + 2));

            int ways = 0;
            if (s.charAt(i) != '0') ways += curr;       // take s[i] alone
            if (val >= 10 && val <= 26) ways += prev;   // take s[i..i+1] together

            int newPrev = curr;
            curr = ways;
            prev = newPrev;
        }
        return curr;
    }
}