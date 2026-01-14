class Solution {
    public int catchThieves(char[] arr, int k) {
        // code here
        int n=arr.length;
        int p=0,t=0;
        int cnt=0;
        while(p<n && t<n){
            while(p<n && arr[p]!='P') p++;
            while(t<n && arr[t]!='T') t++;
            if(p>=n || t>=n) break;
            if(p<n && t<n){
                if(Math.abs(p-t)<=k){
                    cnt++;
                    p++;
                    t++;
                }else if(p<t){
                    p++;
                }else{
                    t++;
                }
            }
        }
        return cnt;
    }
}