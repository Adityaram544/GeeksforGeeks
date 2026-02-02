class Solution {
    public int maxCircularSum(int arr[]) {
        // code here
        int n=arr.length;
        int mini=Integer.MAX_VALUE,minSum=0;
        int maxi=Integer.MIN_VALUE,maxSum=0;
        int totalSum=0;
        for(int num:arr){
            totalSum+=num;
            
            minSum+=num;
            mini=Math.min(mini,minSum);
            if(minSum>0){
                minSum=0; 
            }
            
            maxSum+=num;
            maxi=Math.max(maxi,maxSum);
            if(maxSum<0){
                maxSum=0;
            }
        }
        return maxi<0 ? maxi : Math.max(maxi,totalSum-mini);   
    }
}
