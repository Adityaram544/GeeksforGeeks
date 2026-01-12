
class Solution {
    public static int[] count_NGE(int arr[], int indices[]) {
        // code here
        int res[]=new int[indices.length];
        for(int i=0;i<indices.length;i++){
            int x=indices[i];
            int cnt=0;
            for(int j=x+1;j<arr.length;j++){
                if(arr[x]<arr[j]){
                    cnt++;
                }
            }
            res[i]=cnt;
        }
        return res;
    }
}
