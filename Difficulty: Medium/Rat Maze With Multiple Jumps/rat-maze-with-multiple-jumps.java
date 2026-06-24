class Solution {
    public ArrayList<ArrayList<Integer>> shortestDist(int[][] mat) {
        // code here
        int n=mat.length;
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        if (mat[0][0]==0) {
            res.add(new ArrayList<>(Arrays.asList(-1)));
            return res;
        }
        int path[][]=new int[n][n];
        int vis[][]=new int[n][n];
        if(solve(path,mat,vis,0,0,n)){
            for(int i=0;i<n;i++){
                ArrayList<Integer> lst=new ArrayList<>();
                for(int j=0;j<n;j++){
                    lst.add(path[i][j]);
                }
                res.add(lst);
            }
        }else{
            res.add(new ArrayList<>(Arrays.asList(-1)));
        }
        return res;
    }
    private boolean solve(int path[][],int mat[][],int vis[][],int i,int j,int n){
        if(i>=n || j>=n || mat[i][j]==0) return false;
        if(i==n-1 && j==n-1){
            path[i][j]=1;
            return true;
        }
        if(vis[i][j]==-1)
            return false;
        path[i][j]=1;
        for(int k=1;k<=mat[i][j];k++){
            if(j+k<n && solve(path,mat,vis,i,j+k,n)) return true;
            if(i+k<n && solve(path,mat,vis,i+k,j,n)) return true;
        }
        path[i][j]=0;
        vis[i][j]=-1;
        return false;
    }
}