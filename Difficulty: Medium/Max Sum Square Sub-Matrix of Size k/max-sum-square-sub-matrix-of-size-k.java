class Solution {
    public int maximumSum(int[][] mat, int k) {
        // code here
        int n=mat.length;
        int pre[][]=new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                pre[i][j]=mat[i-1][j-1]+pre[i-1][j]
                          +pre[i][j-1]-pre[i-1][j-1];
            }
        }
        int res=Integer.MIN_VALUE;
        for(int i=0;i<=n-k;i++){
            for(int j=0;j<=n-k;j++){
                int s=pre[i+k][j+k]-pre[i][j+k]
                      -pre[i+k][j]+pre[i][j];
                res=Math.max(res,s);
            }
        }
        return res;
    }
}