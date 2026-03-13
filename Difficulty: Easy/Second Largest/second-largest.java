class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n=arr.length;
        int f=arr[0],s=-1;
        for(int i=1;i<n;i++){
            if(arr[i]>f){
                s=f;
                f=arr[i];
            }else if(arr[i]!=f && arr[i]>s){
                s=arr[i];
            }
        }
        return s;
    }
}