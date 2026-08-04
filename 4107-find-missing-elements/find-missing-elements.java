class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> a=new ArrayList<>();
        HashSet<Integer> val=new HashSet<>();
        int max=0;
        int min=101;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
            val.add(num);
        }
        while(min<max){
            if(!val.contains(min)) a.add(min);
            min++;
        }
        return a;
    }
}