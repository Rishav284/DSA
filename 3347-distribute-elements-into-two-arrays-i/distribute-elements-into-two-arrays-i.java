class Solution {
    public int[] resultArray(int[] nums) {
        int n= nums.length;
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>();
        a1.add(nums[0]);
        a2.add(nums[1]);
        for(int i=2;i<n;i++){
            if(a1.get(a1.size()-1)>a2.get(a2.size()-1)) a1.add(nums[i]);
            else a2.add(nums[i]);
        }
        int i=0;
        while(i<a1.size()) nums[i]= a1.get(i++);
        int j=0;
        while(j<a2.size()) nums[i++]=a2.get(j++);
        return nums;
    }
}