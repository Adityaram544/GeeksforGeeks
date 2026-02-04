class Solution {
    public int getLastMoment(int n, int left[], int right[]) {
        // code here
        int lastM=0;
        for(int l:left){
            lastM=Math.max(lastM,l);
        }
        for(int r:right){
            lastM=Math.max(lastM,n-r);
        }
        return lastM;
    }
}