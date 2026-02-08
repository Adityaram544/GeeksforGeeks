class Solution {
    int maxProduct(int[] arr) {
        // code here
        int n=arr.length;
        int maxi=arr[0],mini=arr[0];
        int res=arr[0];
        for(int i=1;i<n;i++){
            int x=arr[i];
            int temp=maxi;
            maxi=Math.max(x,Math.max(x*maxi,x*mini));
            mini=Math.min(x,Math.min(x*temp,x*mini));
            res=Math.max(res,maxi);
        }
        return res;
    }
}