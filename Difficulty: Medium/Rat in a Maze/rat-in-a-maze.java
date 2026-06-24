class Solution {
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        int n=maze.length;
        ArrayList<String> res=new ArrayList<>();
        if(maze[0][0]==0) return res;
        int vis[][]=new int[n][n];
        solve(res,"",maze,0,0,n,vis);
        return res;
    }
    private boolean isSafe(int i,int j,int n,int vis[][],int maze[][]){
        return (i>=0 && i<n && j>=0 && j<n && maze[i][j]==1 && vis[i][j]==0);
    }
    private void solve(ArrayList<String> res,String s,int maze[][],
            int i,int j,int n,int vis[][]){
        if(i==n-1 && j==n-1){
            res.add(s);
            return;
        }
        vis[i][j]=1;
        if(isSafe(i+1,j,n,vis,maze)){
            solve(res,s+"D",maze,i+1,j,n,vis);
        }
        if(isSafe(i,j-1,n,vis,maze)){
            solve(res,s+"L",maze,i,j-1,n,vis);
        }
        if(isSafe(i,j+1,n,vis,maze)){
            solve(res,s+"R",maze,i,j+1,n,vis);
        }
        if(isSafe(i-1,j,n,vis,maze)){
            solve(res,s+"U",maze,i-1,j,n,vis);
        }
        vis[i][j]=0;
    }
}