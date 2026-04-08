class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int n=arr.length;
        int l=0,r=n-1;
        while(l<r){
            if(arr[l]==1 && arr[r]==0){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }else if(arr[l]==1){
                r--;
            }else{
                l++;
            }
        }
    }
}
