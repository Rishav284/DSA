class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        int currInd=0;
        backtrack(digits,currInd,ans,new StringBuilder());
        return ans;
    }
    static void backtrack(String digits, int currInd, List<String> ans, StringBuilder sb) {
        if(currInd==digits.length()){
            ans.add(sb.toString());
            return;
        }
        int d=digits.charAt(currInd)-'0';
        if(d<7){
            for(int i=(d-2)*3;i<(d-1)*3;i++){
                sb.append((char)('a'+i));
                backtrack(digits,currInd+1,ans,sb);
                sb.deleteCharAt(sb.length()-1);
            }
        }
        if(d==7){
            for(int i=15;i<19;i++){
                sb.append((char)('a'+i));
                backtrack(digits,currInd+1,ans,sb);
                sb.deleteCharAt(sb.length()-1);
            }
        }
        if(d==8){
            for(int i=19;i<22;i++){
                sb.append((char)('a'+i));
                backtrack(digits,currInd+1,ans,sb);
                sb.deleteCharAt(sb.length()-1);
            }
        }
        if(d==9){
            for(int i=22;i<26;i++){
                sb.append((char)('a'+i));
                backtrack(digits,currInd+1,ans,sb);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
}