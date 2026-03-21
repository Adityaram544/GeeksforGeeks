class Solution {
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        ArrayList<String> res=new ArrayList<>();
        if(maze[0][0]==0) return res;
        int dir[][]=new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
        char way[]=new char[]{'D','R','U','L'};
        paths(maze,0,0,res,"",dir,way);
        Collections.sort(res);
        return res;
    }
    private void paths(int maze[][], int i, int j, ArrayList<String> res,
        String s,int dir[][],char way[]){
        if(i<0 || j<0 || i>=maze.length || j>=maze.length || maze[i][j]!=1){
            return;
        } 
        if(i==maze.length-1 && j==maze.length-1 && maze[i][j]==1){
            res.add(s);
            return;
        }
        maze[i][j]=0;
        for(int k=0;k<4;k++){
            paths(maze,i+dir[k][0],j+dir[k][1],res,s+way[k],dir,way);
        }
        maze[i][j]=1;
    } 
}