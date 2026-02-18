class Solution {
    static long inversionCount(int arr[]) {
        // Code Here
        int n=arr.length;
        return mergeSort(arr,0,n-1);
    }
    static long mergeSort(int arr[],int l,int r){
        long cnt=0;
        if(l>=r) return cnt;
        int m=l+(r-l)/2;
        cnt+=mergeSort(arr,l,m);
        cnt+=mergeSort(arr,m+1,r);
        cnt+=merge(arr,l,m,r);
        return cnt;
    }
    static long merge(int arr[],int l,int m,int r){
        int temp[]=new int[r-l+1];
        int i=l,j=m+1,k=0;
        long cnt=0;
        while(i<=m && j<=r){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
                cnt+=(m-i+1);
            }
        }
        while(i<=m){
            temp[k++]=arr[i++];
        }
        while(j<=r){
            temp[k++]=arr[j++];   
        }
        for(int x=l;x<=r;x++){
            arr[x]=temp[x-l];
        }
        return cnt;
    }
}