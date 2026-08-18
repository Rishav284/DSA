class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        if(k*(k+1)/2>n) return result;
        List<Integer> ds=new ArrayList<>();
        backtrack(k,1,n,ds,result);
        return result;
    }
    static void backtrack(int k, int currElement, int n, List<Integer> ds, List<List<Integer>> result) {
        if(ds.size()==k){
            if(n==0){
                result.add(new ArrayList<>(ds));
            }
            return;
        }
        for(int i=currElement;i<=9;i++){
            ds.add(i);
            backtrack(k,i+1,n-i,ds,result);
            ds.remove(ds.size()-1);
        }
    }
}