class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> a=new ArrayList<>();
        List<Integer> currElements=new ArrayList<>();
        recursiveCombSum(0,candidates,target,currElements,a);
        return a;
    }
    static void recursiveCombSum(int idx,int[] cd,int target,List<Integer> currElements,List<List<Integer>> a){
        if(idx==cd.length){
            if(target==0){
                a.add(new ArrayList<>(currElements));
            }
            return;
        }
        if(target-cd[idx]>=0){
            currElements.add(cd[idx]);
            recursiveCombSum(idx,cd,target-cd[idx],currElements,a);
            currElements.remove(currElements.size()-1);
        }
        recursiveCombSum(idx+1,cd,target,currElements,a);
    }
}