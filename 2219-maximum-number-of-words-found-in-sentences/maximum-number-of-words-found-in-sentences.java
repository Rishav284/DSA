class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans=0;
        for (String sentence : sentences) {
            String[] words = sentence.split("\\s+");
            ans=Math.max(ans,words.length);
        }
        return ans;
    }
}