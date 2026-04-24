class Solution {
    public int visibleBuildings(int arr[]) {
        // code here
        int maxi=arr[0];
        int cnt=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=maxi){
                cnt++;
                maxi=arr[i];
            }
        }
        return cnt;
    }
}