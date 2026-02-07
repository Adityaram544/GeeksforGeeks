class Solution {
    int maxSum(int[] arr) {
        // code here
        int n=arr.length;
        int curS=0,arrS=0;
        for(int i=0;i<n;i++){
            arrS+=arr[i];
            curS+=i*arr[i];
        }
        int maxS=curS;
        for(int i=1;i<n;i++){
            curS=curS+arrS-n*arr[n-i];
            maxS=Math.max(maxS,curS);
        }
        return maxS;
    }
}