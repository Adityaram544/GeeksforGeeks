// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int n=arr.length;
        int m=arr[0].length;
        int maxC=-1,idx=-1;
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<m;j++){
                if(arr[i][j]==1){
                    c+=1;
                }
            }
            if(c>maxC){
                maxC=c;
                idx=i;
            }
        }
        return idx;
    }
}