class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        int open=0;
        int close=0;
        StringBuilder sb=new StringBuilder();
        helper(n,sb,ans,open,close);
        return ans;
    }
    static void helper(int n,StringBuilder sb,List<String> ans,int open,int close){
        if(close>open) return;
        if(open==n && close==n){
            String s= sb.toString();
            ans.add(s);
            return;
        }
        if(open!=n) {
            sb.append('(');
            helper(n,sb,ans,open+1,close);
            sb.deleteCharAt(sb.length()-1);
        }
        sb.append(')');
        helper(n,sb,ans,open,close+1);
        sb.deleteCharAt(sb.length()-1);
    }
}