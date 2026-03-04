class Solution {
    public int maxSubarrayXOR(int[] arr, int k) {
        // code here
        int n=arr.length;
        int xor=0,l=0;
        int maxXor=0;
        for(int r=0;r<n;r++){
            xor^=arr[r];
            if(r-l+1==k){
                maxXor=Math.max(maxXor,xor);
                xor^=arr[l];
                l++;
            }
        }
        return maxXor;
    }
}
