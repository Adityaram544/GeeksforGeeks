class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        int n=arr.length;
        int l=0,h=n-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(arr[m]<=x){
                l=m+1;
            }else{
                h=m-1;
            }
        }
        return h;
    }
}
