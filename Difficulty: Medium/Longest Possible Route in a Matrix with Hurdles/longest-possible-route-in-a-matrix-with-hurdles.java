class Solution {
    private int rows;
    private int cols;
    private int maxEdges;
    private static int dx[]={0,0,-1,1};
    private static int dy[]={-1,1,0,0};
    public int longestPath(int[][] mat, int xs, int ys, int xd, int yd) {
        // code here
        rows=mat.length;
        cols=mat[0].length;
        maxEdges=-1;
        if(xs==xd && ys==yd){
            return mat[xs][ys]==1 ? 0 : -1;
        }
        if(mat[xs][ys]==0 || mat[xd][yd]==0){
            return -1;
        }
        boolean vis[][]=new boolean[rows][cols];
        dfs(mat,xs,ys,xd,yd,1,vis);
        return maxEdges==-1 ? -1 : maxEdges;
    }
    private void dfs(int mat[][],int x,int y,int xd,int yd,int cur,boolean vis[][]){
        if(x==xd && y==yd){
            int e=cur-1;
            if(e>maxEdges){
                maxEdges=e;
            }
            return;
        }
        vis[x][y]=true;
        for(int i=0;i<4;i++){
            int nx=x+dx[i];
            int ny=y+dy[i];
            if(nx>=0 && nx<rows && ny>=0 && ny<cols && mat[nx][ny]==1 && !vis[nx][ny]){
                dfs(mat,nx,ny,xd,yd,cur+1,vis);
            }
        }
        vis[x][y]=false;
    }
}