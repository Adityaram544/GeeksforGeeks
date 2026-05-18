class Solution {
    public int maxSum(int n) {
        // code here.
        if(n==0) return 0;
        int s=maxSum(n/2)+maxSum(n/3)+maxSum(n/4);
        if(s<=n) return n;
        return s;
    }
}
