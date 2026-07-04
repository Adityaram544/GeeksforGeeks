class Solution {
    long res=0;
    public int countSubstring(String s) {
        // code here
        int n=s.length();
        long pre[]=new long[n+1];
        for(int i=1;i<=n;i++){
            pre[i]=pre[i-1]+(s.charAt(i-1)=='1' ? 1 : -1);
        }
        mergeSort(pre,0,n);
        return (int)res;
    }
    public void mergeSort(long arr[],int l,int r){
        if(l>=r) return;
        int mid=l+(r-l)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        cntPairs(arr,l,mid,r);
        merge(arr,l,mid,r);
    }
    public void cntPairs(long arr[],int l,int mid,int r){
        int j=mid+1;
        for(int i=l;i<=mid;i++){
            while(j<=r && arr[j]<=arr[i]){
                j++;
            }
            res+=(r-j+1);
        }
    }
    public void merge(long arr[],int l,int mid,int r){
        long temp[]=new long[r-l+1];
        int i=l,j=mid+1,k=0;
        while(i<=mid && j<=r){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
            }
        }
        while(i<=mid)
            temp[k++]=arr[i++];
        while(j<=r)
            temp[k++]=arr[j++];
        k=0;
        for(i=l;i<=r;i++){
            arr[i]=temp[k++];
        }
    }
}