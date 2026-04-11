class Solution {
    public int countIncreasing(int[] arr) {
        // code here
        int cnt=0,res=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                cnt++;
            }else{
                cnt=0;
            }
            res+=cnt;
        }
        return res;
    }
}
