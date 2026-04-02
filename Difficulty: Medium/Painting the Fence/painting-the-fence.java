class Solution {
    int countWays(int n, int k) {
        // code here.
        if(n==1) return k;
        int pre2=k;
        int pre1=k*k;
        for(int i=3;i<=n;i++){
            int cur=(pre1+pre2)*(k-1);
            pre2=pre1;
            pre1=cur;
        }
        return pre1;
    }
}
