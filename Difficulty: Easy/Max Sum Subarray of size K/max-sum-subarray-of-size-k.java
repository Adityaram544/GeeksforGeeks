class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int maxSum=Integer.MIN_VALUE;
        int len=0;
        int sum=0;
        int l=0;
        for(int r=0;r<arr.length;r++){
            sum+=arr[r];
            len++;
            if(len==k){
                len--;
                maxSum=Math.max(maxSum,sum);
                sum-=arr[l];
                l++;
            }
        }
        return maxSum;
    }
}