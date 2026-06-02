class Solution {
    public int sumDiffPairs(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int res=0;
        int i=arr.length-1;
        while(i>0){
            if(arr[i]-arr[i-1]<k){
                res+=arr[i]+arr[i-1];
                i-=2;
            }else{
                i-=1;
            }
        }
        return res;
    }
}
// 3 5 9 10 12 17 19