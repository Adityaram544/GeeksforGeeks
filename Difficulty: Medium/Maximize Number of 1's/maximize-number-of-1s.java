class Solution {
    public int maxOnes(int arr[], int k) {
        // code here
        int n=arr.length;
        int l=0,z=0,maxLen=0;
        for(int r=0;r<n;r++){
            if(arr[r]==0){
                z++;
            }
            while(z>k){
                if(arr[l]==0){
                    z--;
                }
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);
        }
        return maxLen;
    }
}