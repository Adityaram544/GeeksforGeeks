class Solution {
    public int minSteps(int[] arr, int start, int end) {
        // code here
        if(start==end) return 0;
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{start,0});
        boolean vis[]=new boolean[1000];
        vis[start]=true;
        while(!q.isEmpty()){
            int cur[]=q.poll();
            int v=cur[0];
            int s=cur[1];
            for(int num:arr){
                int next=(v*num)%1000;
                if(!vis[next]){
                    if(next==end) return s+1;
                    vis[next]=true;
                    q.add(new int[]{next,s+1});
                }
            }
        }
        return -1;
    }
}