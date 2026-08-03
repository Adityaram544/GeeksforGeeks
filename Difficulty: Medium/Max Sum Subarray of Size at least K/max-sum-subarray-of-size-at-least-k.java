class Solution {
    public int maxSumWithK(int[] arr, int k) {
        // code here
        int n=arr.length;
        long pre[]=new long[n];
        pre[0]=arr[0];
        for(int i=1;i<n;i++){
            pre[i]=Math.max(arr[i],pre[i-1]+arr[i]);
        }
        long winSum=0;
        for(int i=0;i<k;i++){
            winSum+=arr[i];
        }
        long maxSum=winSum;
        for(int i=k;i<n;i++){
            winSum+=arr[i];
            winSum-=arr[i-k];
            maxSum=Math.max(maxSum,winSum);
            maxSum=Math.max(maxSum,winSum+pre[i-k]);
        }
        return (int)maxSum;
    }
}
// 1 -1 2 -1
// 1