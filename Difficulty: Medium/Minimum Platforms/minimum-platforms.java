class Solution {
    public int minPlatform(int arr[], int dep[]) {
        //  code here
        int n=arr.length;
        int minP=0;
        Arrays.sort(arr);
        Arrays.sort(dep);
        for(int i=0;i<n;i++){
            int l=0,h=n-1;
            int idx=-1;
            while(l<=h){
                int m=l+(h-l)/2;
                if(dep[m]<arr[i]){
                    idx=m;
                    l=m+1;
                }else{
                    h=m-1;
                }
            }
            minP=Math.max(minP,i-idx);
        }
        return minP;
    }
}
