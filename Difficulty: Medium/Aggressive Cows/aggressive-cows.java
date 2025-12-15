class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int n=stalls.length;
        int low=1;
        int high=stalls[n-1]-stalls[0];
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canPlace(stalls,mid,k)==true){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return high;
    }
    private static boolean canPlace(int stalls[],int dist,int k){
        int n=stalls.length;
        int count=1,last=stalls[0];
        for(int i=1;i<n;i++){
            if(stalls[i]-last>=dist){
                count++;
                last=stalls[i];
            }
            if(count>=k) return true;
        }
        return false;
    }
}