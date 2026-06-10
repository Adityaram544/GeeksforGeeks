class Solution {
    int cnt;
    public int binarySearchable(int[] arr) {
        // code here
        cnt=0;
        dfs(arr,0,arr.length-1,Integer.MIN_VALUE,Integer.MAX_VALUE);
        return cnt;
    }
    private void dfs(int arr[],int l,int r,int low,int high){
        if(l>r) return;
        int mid=l+(r-l)/2;
        if(arr[mid]>low && arr[mid]<high){
            cnt++;
        }
        dfs(arr,l,mid-1,low,Math.min(high,arr[mid]));
        dfs(arr,mid+1,r,Math.max(low,arr[mid]),high);
    }
};