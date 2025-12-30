class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int n1=a.length;
        int n2=b.length;
        int cnt=0;
        int l=0,r=0;
        while(l<n1 && r<n2){
            cnt++;
            if(a[l]<=b[r]){
                if(cnt==k) return a[l];
                l++;
            }else{
                if(cnt==k) return b[r];
                r++;
            }
        }
        while(l<n1){
            cnt++;
            if(cnt==k) return a[l];
            l++;
        }
        while(r<n2){
            cnt++;
            if(cnt==k) return b[r];
            r++;
        }
        return -1;
    }
}