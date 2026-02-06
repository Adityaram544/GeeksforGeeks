class Solution {
    int[] smallestDiff(int a[], int b[], int c[]) {
        // write code here
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        int i=0,j=0,k=0;
        int n=a.length;
        int res[]=new int[3];
        int minDiff=Integer.MAX_VALUE;
        while(i<n && j<n && k<n){
            int curDiff=Math.max(a[i],Math.max(b[j],c[k]))-
                    Math.min(a[i],Math.min(b[j],c[k]));
            if(minDiff>curDiff){
                res[0]=a[i];
                res[1]=b[j];
                res[2]=c[k];
                minDiff=curDiff;
            }
            if(a[i]<=b[j] && a[i]<=c[k]) i++;
            else if(b[j]<=a[i] && b[j]<=c[k]) j++;
            else k++;
        }
        Arrays.sort(res); 
        i=0;
        j=2;
        while(i<=j){
            int temp=res[i];
            res[i]=res[j];
            res[j]=temp;
            i++;
            j--;
        }
        return res;
    }
}
