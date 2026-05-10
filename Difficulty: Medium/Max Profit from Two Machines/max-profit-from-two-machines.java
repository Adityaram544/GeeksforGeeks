class Solution {
    public int maxProfit(int x, int y, int[] a, int[] b) {
        // code here
        int n=a.length;
        int maxP=0;
        int difs[][]=new int[n][2];
        for(int i=0;i<n;i++){
            difs[i][0]=Math.abs(a[i]-b[i]);
            difs[i][1]=i;
        }
        Arrays.sort(difs,(v1,v2)->Integer.compare(v2[0],v1[0]));
        for(int i=0;i<n;i++){
            int idx=difs[i][1];
            if(a[idx]>=b[idx]){
                if(x>0){
                    maxP+=a[idx];
                    x--;
                }else{
                    maxP+=b[idx];
                    y--;
                }
            }else{
                if(y>0){
                    maxP+=b[idx];
                    y--;
                }else{
                    maxP+=a[idx];
                    x--;
                }
            }
        }
        return maxP;
    }
}