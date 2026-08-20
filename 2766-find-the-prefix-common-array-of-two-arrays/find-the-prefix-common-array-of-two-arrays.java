class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer> a1=new HashSet<>();
        HashSet<Integer> a2=new HashSet<>();
        int[] ans=new int[A.length];
        for(int i=0;i<A.length;i++){
            int c=0;
            a1.add(A[i]);
            a2.add(B[i]);
            if(A[i]==B[i]) c++;
            else {
                if (a2.contains(A[i])) c++;
                if (a1.contains(B[i])) c++;
            }
            ans[i]=c;
            if(i>0) ans[i]+=ans[i-1];
        }
        return ans;
    }
}