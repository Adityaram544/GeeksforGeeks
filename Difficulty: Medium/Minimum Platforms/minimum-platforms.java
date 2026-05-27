class Solution {
    public int minPlatform(int arr[], int dep[]) {
        //  code here
        int n=arr.length;
        int minP=0;
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=0,j=0,cnt=0;
        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                cnt++;
                minP=Math.max(minP,cnt);
                i++;
            }else{
                cnt--;
                j++;
            }
        }
        return minP;
    }
}



// 910 1120 1130 1200 1900 2000