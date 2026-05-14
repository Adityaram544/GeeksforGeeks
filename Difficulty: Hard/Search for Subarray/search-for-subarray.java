class Solution {
    public ArrayList<Integer> search(int[] a, int[] b) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        int n=a.length;
        int m=b.length;
        int lps[]=buildLps(b);
        int i=0,j=0;
        while(i<n){
            if(a[i]==b[j]){
                i++;
                j++;
            }
            if(j==m){
                res.add(i-m);
                j=lps[j-1];
            }else if(i<n && a[i]!=b[j]){
                if(j!=0){
                    j=lps[j-1];
                }else{
                    i++;
                }
            }
        }
        return res;
    }
    private int[] buildLps(int pat[]){
        int m=pat.length;
        int lps[]=new int[m];
        int len=0;
        int i=1;
        while(i<m){
            if(pat[i]==pat[len]){
                len++;
                lps[i]=len;
                i++;
            }else{
                lps[i]=0;
                i++;
            }
        }
        return lps;
    }
}