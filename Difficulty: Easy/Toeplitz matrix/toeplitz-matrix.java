class Solution {
    public boolean isToeplitz(int[][] mat) {
        // code here
        for(int i=0;i<mat.length-1;i++){
            for(int j=0;j<mat[0].length-1;j++){
                if(mat[i][j]!=mat[i+1][j+1]){
                    return false;
                }
            }
        }
        return true;
    }
}