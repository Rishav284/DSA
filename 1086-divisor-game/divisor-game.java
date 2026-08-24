class Solution {
    public boolean divisorGame(int n) {
        boolean[] a=new boolean[n];
        a[0]=false;
        for(int i=1;i<=n/2;i++){
            a[i]=false;
            for(int j=0;j<i/2;j++){
                if((i+1)%(j+1)==0 && !a[j]) {
                    a[i]=true;
                    break;
                }
            }
            if(n%(i+1)==0 && !a[i]) return true;
        }
        return false;
    }
}