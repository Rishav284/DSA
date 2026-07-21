class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') count++;
        }
        int a=s.length()-count;
        count-=1;
        StringBuilder ans=new StringBuilder();
        while(count-->0){
            ans.append('1');
        }
        while(a-->0) ans.append('0');
        ans.append('1');
        return ans.toString();
    }
}