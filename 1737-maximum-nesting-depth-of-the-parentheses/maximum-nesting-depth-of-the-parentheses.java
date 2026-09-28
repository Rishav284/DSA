class Solution {
    public int maxDepth(String s) {
        int n=s.length();
        int max=0;
        int cnt=0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='('){
                cnt++;
                max=Math.max(max,cnt);
            }
            else if(c==')'){
                cnt--;
            }
        }
        return max;
    }
}