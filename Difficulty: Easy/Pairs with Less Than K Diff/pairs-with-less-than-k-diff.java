class Solution {
    public static int countPairs(int arr[], int k) {
        // code here
        int cnt=0;
        Arrays.sort(arr);
        int l=0,r=0;
        while(r<arr.length){
            if(l==r) r++;
            else{
                int dif=Math.abs(arr[r]-arr[l]);
                if(dif<k){
                    cnt+=(r-l);
                    r++;
                }else{
                    l++;
                }     
            }
        }
        return cnt;
    }
}
// 1 2 4 10
// 2 3 4
