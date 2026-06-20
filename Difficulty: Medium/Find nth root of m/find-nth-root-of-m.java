class Solution {
    public int nthRoot(int n, int m) {
        // code here
        for(int i=0;i<=m;i++){
            if((int)Math.pow(i,n) == m){
                return i;
            }
        }
        return -1;
    }
}