class Solution {
    public boolean canSplit(int arr[]) {
        // code here
        int t=0,s=0;
        for(int x:arr){
            t+=x;
        }
        for(int x:arr){
            s+=x;
            if(s==t-s){
                return true;
            }
        }
        return false;
    }
}