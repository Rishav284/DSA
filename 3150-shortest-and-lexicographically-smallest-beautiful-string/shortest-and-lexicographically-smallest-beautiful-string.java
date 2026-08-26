class Solution {
    public String shortestBeautifulSubstring(String s1, int k) {
        int start=-1;
        StringBuilder s=new StringBuilder(s1);
        int len=s.length();
        int l=0,r=0;
        int count1s=0;
        ArrayList<String> a=new ArrayList<>();
        while(r<s.length()){
            char c=s.charAt(r);
            if(c=='1'){
                count1s++;
            }
            while(count1s>=k){
                if(len>=(r-l+1)){
                    len=r-l+1;
                    start=l;
                    a.add(s.substring(l,r+1));
                }
                char b=s.charAt(l);
                if(b=='1') count1s--;
                l++;
            }
            r++;
        }
        if(start==-1) return "";
        int i=0;
        while(i<a.size()){
            if(a.get(i).length()>len) a.remove(i);
            else i++;
        }
        Collections.sort(a);
        return a.get(0);
    }
}