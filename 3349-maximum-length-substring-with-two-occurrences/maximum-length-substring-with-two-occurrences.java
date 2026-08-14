class Solution {
    public int maximumLengthSubstring(String s) {
        int[] c=new int[26];
        int ans=0;
        int l=0;
        int r=0;
        while(r<s.length()){
            char ch=s.charAt(r);
            c[ch-'a']++;
            while (c[ch-'a']>2){
                char a=s.charAt(l);
                c[a-'a']--;
                l++;
            }
            ans=Math.max(ans,r-l+1);
            r++;
        }
        return ans;
    }
}