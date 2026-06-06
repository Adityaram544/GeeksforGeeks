class Solution {
    public int numOfWays(int n, int m) {
        // code here
        int res=0;
        int rem=(n*m)-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int cur=Math.max(rem-getPos(i,j,n,m),0);
                res+=cur;
            }
        }
        return res;
    }
    public int getPos(int i,int j,int n,int m){
        int cnt=0;
        if(i+2<n && j+1<m) cnt++;
        if(i+2<n && j-1>=0) cnt++;
        
        if(i-2>=0 && j+1<m) cnt++;
        if(i-2>=0 && j-1>=0) cnt++;
        
        if(i+1<n && j+2<m) cnt++;
        if(i-1>=0 && j+2<m) cnt++;
        
        if(i+1<n && j-2>=0) cnt++;
        if(i-1>=0 && j-2>=0) cnt++;
        return cnt;
    }
}