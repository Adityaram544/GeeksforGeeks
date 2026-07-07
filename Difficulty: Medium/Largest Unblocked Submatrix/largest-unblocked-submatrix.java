class Solution {
    public int largestArea(int n, int m, int k, int[][] arr) {
        // code here
        if(k==0) return n*m;
        int rows[]=new int[k];
        int cols[]=new int[k];
        for(int i=0;i<k;i++){
            rows[i]=arr[i][0];
            cols[i]=arr[i][1];
        }
        Arrays.sort(rows);
        Arrays.sort(cols);
        int maxRG=rows[0]-1;
        int maxCG=cols[0]-1;
        for(int i=1;i<k;i++){
            maxRG=Math.max(maxRG,rows[i]-rows[i-1]-1);
            maxCG=Math.max(maxCG,cols[i]-cols[i-1]-1);
        }
        maxRG=Math.max(maxRG,n-rows[k-1]);
        maxCG=Math.max(maxCG,m-cols[k-1]);
        return maxRG*maxCG;
    }
}