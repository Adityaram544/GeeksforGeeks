class Solution {
    public int maxWater(int arr[]) {
        // code here
        int n=arr.length;
        int pre[]=new int[n];
        pre[0]=arr[0];
        for(int i=1;i<n;i++){
            pre[i]=Math.max(arr[i],pre[i-1]);
        }
        int suf[]=new int[n];
        suf[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            suf[i]=Math.max(arr[i],suf[i+1]);
        }
        int water=0;
        for(int i=0;i<n;i++){
            water+=Math.min(pre[i],suf[i]) - arr[i];
        }
        return water;
    }
}
