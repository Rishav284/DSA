class Solution {
    public boolean isAnagram(String s,String t){
        int n1=s.length();
        int n2=t.length();
        if(n1!=n2) return false;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n1;i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<n2;i++){
            char c=t.charAt(i);
            if(!map.containsKey(c)) return false;
            else{
                map.replace(c,map.get(c)-1);
                if(map.get(c)==0) map.remove(c);
            }
        }
        return true;
    }
}