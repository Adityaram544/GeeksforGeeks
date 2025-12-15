class Solution {
    public int findPages(int[] arr, int k) {
        // code here
        int n=arr.length;
        if(k>n) return -1;
        int total=0,maxi=Integer.MIN_VALUE;
        for(int x:arr){
            maxi=Math.max(maxi,x);
            total+=x;
        }
        int low=maxi,high=total;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(countStu(arr,mid)<=k){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    private static int countStu(int arr[],int pages){
        int stu=1,pageStu=0;
        for(int x:arr){
            if(pageStu+x<=pages){
                pageStu+=x;
            }else{
                stu++;
                pageStu=x;
            }
        }
        return stu;
    }
}