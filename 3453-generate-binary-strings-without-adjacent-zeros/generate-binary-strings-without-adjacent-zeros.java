class Solution {
    public List<String> validStrings(int n) {
        List<String> ans=new ArrayList<>();
        boolean isZero=false;
        StringBuilder sb=new StringBuilder();
        helper(isZero,n,sb,ans);
        return ans;
    }
    static void helper(boolean isZero,int n,StringBuilder sb,List<String> ans){
        if(sb.length()==n){
            ans.add(sb.toString());
            return;
        }
        if(!isZero){
            sb.append('1');
            helper(false,n,sb,ans);
            sb.deleteCharAt(sb.length()-1);
            sb.append('0');
            helper(true,n,sb,ans);
            sb.deleteCharAt(sb.length()-1);
        }
        else{
            sb.append('1');
            helper(false,n,sb,ans);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}