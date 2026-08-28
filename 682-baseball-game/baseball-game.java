class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> a=new ArrayList<>();
        int ans=0;
        for (String s : operations) {
            if (s.equals("+")) {
                int val = a.get(a.size() - 1) + a.get(a.size() - 2);
                a.add(val);
                ans += val;
            } else if (s.equals("D")) {
                int val = a.get(a.size() - 1) * 2;
                a.add(val);
                ans += val;
            } else if (s.equals("C")) {
                int val = a.get(a.size() - 1);
                a.remove(a.size()-1);
                ans -= val;
            } else {
                int val = Integer.parseInt(s);
                a.add(val);
                ans += val;
            }
        }
        return ans;
    }
}