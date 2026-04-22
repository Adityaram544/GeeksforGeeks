class Solution {
    public ArrayList<Integer> findMean(int[] arr, int[][] queries) {
        // code here
        int n=arr.length;
        ArrayList<Integer> res=new ArrayList<>();
        int pre[]=new int[n];
        pre[0]=arr[0];
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]+arr[i];
        }
        for(int x[]:queries){
            int l=x[0];
            int r=x[1];
            int sum=(l==0) ? pre[r] : pre[r]-pre[l-1];
            int m=sum/(r-l+1);
            res.add(m);
        }
        return res;
    }
}