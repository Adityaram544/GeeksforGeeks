class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int i=0,idx=0;
        while(i<arr.length){
            if(arr[i]!=0){
                arr[idx++]=arr[i];
            }
            i++;
        }
        while(idx<arr.length){
            arr[idx++]=0;
        }
    }
}