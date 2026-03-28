class Solution {
    public void reverseInGroups(int[] arr, int k) {
        // code here
        int n=arr.length;
        for(int i=0;i<n;i+=k){
            int e=Math.min(n-1,i+k-1);
            reverse(arr,i,e);
        }
    }
    private void reverse(int arr[],int l,int r){
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
}

// 5 4 3 2 1