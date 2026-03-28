class Solution {
    public int celebrity(int mat[][]) {
        // code here
        int n=mat.length;
        int c=0;
        for(int i=1;i<n;i++){
            if(mat[c][i]==1){
                c=i;
            }
        }
        for(int i=0;i<n;i++){
            if(i!=c){
                if(mat[c][i]==1 || mat[i][c]==0){
                    return -1;
                }
            }
        }
        return c;
    }
}