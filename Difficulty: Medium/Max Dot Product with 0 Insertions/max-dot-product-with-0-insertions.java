class Solution {
    public int maxDotProduct(int[] a, int[] b) {
        // code here
        int maxDotPro=0;
        int n=a.length,m=b.length;
        int dp[][]=new int[n+1][m+1];
        int NEG=Integer.MIN_VALUE;
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],NEG);
        }
        for(int i=0;i<=n;i++){
            dp[i][m]=0;
        }
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                int take=NEG;
                if(dp[i+1][j+1]!=NEG){
                    take=a[i]*b[j]+dp[i+1][j+1];
                }
                int skip=dp[i+1][j];
                dp[i][j]=Math.max(take,skip);
            }
        }
        return dp[0][0];
    }
}