class Solution {
    static void rotateArr(int arr[], int d) {
        // code here
        int n=arr.length;
        d=d%n;
        reverse(0,d-1,arr);
        reverse(d,n-1,arr);
        reverse(0,n-1,arr);
    }
    static void reverse(int l,int r,int arr[]){
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
}