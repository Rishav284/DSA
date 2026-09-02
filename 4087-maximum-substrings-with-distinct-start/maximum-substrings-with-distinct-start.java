class Solution {
    public int maxDistinct(String s) {
        int[] freq=new int[26];
        int ans=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(freq[c-'a']==0){
                freq[c-'a']++;
                ans++;
            }  
        }
        return ans;
    }
}