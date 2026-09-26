class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        for (String string : word1) {
            sb1.append(string);
        }
        for (String s : word2) {
            sb2.append(s);
        }
        return sb1.compareTo(sb2)==0;
    }
}