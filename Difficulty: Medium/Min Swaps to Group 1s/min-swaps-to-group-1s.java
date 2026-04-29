class Solution {
    public int minSwaps(int[] arr) {
        // code here
        int n=arr.length,ones=0;
        for(int x:arr){
            if(x==1) ones++;
        }
        if(ones==0) return -1;
        int cnt=Integer.MAX_VALUE;
        int l=0,r=0,z=0;
        while(r<n){
            if(arr[r]==0) z++;
            if(r-l+1==ones){
                cnt=Math.min(cnt,z);
                if(arr[l]==0) z--;
                l++;
            }
            r++;
        }
        return cnt;
    }
}
