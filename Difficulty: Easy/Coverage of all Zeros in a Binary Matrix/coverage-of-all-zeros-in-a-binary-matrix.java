class Solution {
    public int findCoverage(int[][] mat) {
        // code here
        int m=mat.length;
        int n=mat[0].length;
        int res=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    for(int k=i-1;k>=0;k--){
                        if(mat[k][j]==1){
                            res++;
                            break;
                        }
                    }
                    for(int k=i+1;k<m;k++){
                        if(mat[k][j]==1){
                            res++;
                            break;
                        }
                    }
                    for(int k=j-1;k>=0;k--){
                        if(mat[i][k]==1){
                            res++;
                            break;
                        }
                    }
                    for(int k=j+1;k<n;k++){
                        if(mat[i][k]==1){
                            res++;
                            break;
                        }
                    }
                }
            }
        }
        return res;
    }
}