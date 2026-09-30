class Solution {
    public int countAsterisks(String s) {
        int n=s.length();
        boolean opened=false;
        int count=0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(!opened && c=='*') count++;
            if(c=='|') opened=!opened; 
        }
        return count;   
    }
}