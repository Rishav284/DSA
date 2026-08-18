class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        if(k*(k+1)/2>n) return result;
        List<Integer> ds=new ArrayList<>();
        backtrack(0,k,1,n,ds,result);
        return result;
    }
    static void backtrack(int currSum, int k, int currElement,int n, List<Integer> ds, List<List<Integer>> result) {
        if(currSum>n) return;
        if(ds.size()==k){
            if(currSum==n && !result.contains(new ArrayList<>(ds))){
                result.add(new ArrayList<>(ds));
            }
            return;
        }
        for(int i=currElement;i<=9;i++){
            ds.add(i);
            backtrack(currSum+i,k,i+1,n,ds,result);
            ds.remove(ds.size()-1);
            backtrack(currSum,k,i+1,n,ds,result);
        }
    }
}