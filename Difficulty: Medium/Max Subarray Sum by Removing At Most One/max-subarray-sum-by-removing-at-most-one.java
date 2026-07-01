class Solution {
    public int maxSumSubarray(int[] arr) {
        // code here
        int skipSum=0;
        int curSum=arr[0];
        int maxSum=arr[0];
        for(int i=1;i<arr.length;i++){
            skipSum=Math.max(curSum,skipSum + arr[i]);
            curSum=Math.max(curSum + arr[i],arr[i]);
            maxSum=Math.max(maxSum,Math.max(curSum,skipSum));
        }
        return maxSum;
    }
}
/*
0 1 1
i=1
2 3 3

i=2
5 6 

*/