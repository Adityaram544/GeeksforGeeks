class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int n=arr.length;
        int x[]=new int[n];
        for(int i=0;i<n;i++){
            x[i]=arr[i];
        }
        Arrays.sort(arr);
        int a=arr[0];
        int k=0;
        for(int i=0;i<n;i++){
            if(a==x[i]){
                k=i;
            }
        }
        return k;
    }
}