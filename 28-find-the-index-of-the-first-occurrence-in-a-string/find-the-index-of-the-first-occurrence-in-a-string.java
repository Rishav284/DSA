class Solution {
    public int strStr(String haystack, String needle) {
        int n1 = needle.length();
        int n2 = haystack.length();
        StringBuilder sb = new StringBuilder(haystack);
        for (int i = 0; i <= n2 - n1; i++) {
            if (sb.charAt(i) == needle.charAt(0)) {
                String s = sb.substring(i, i + n1);
                if (s.equals(needle)) return i;
            }
        }
        return -1;
    }
}