class Solution {
    public int findMaxProduct(int[] arr) {
        // code here
        int n=arr.length;
        long pro=1;
        long mod=1000000007L;
        if(n==1) return arr[0];
        int negCnt=0,zCnt=0;
        int maxNeg=Integer.MIN_VALUE;
        for(int x:arr){
            if(x==0){
                zCnt++;
                continue;
            }else if(x<0){
                negCnt++;
                maxNeg=Math.max(maxNeg,x);
            }
        }
        if(zCnt==n) return 0;
        if(negCnt==1 && zCnt+negCnt==n) return 0;
        boolean r=false;
        int used=0;
        for(int x:arr){
            if(x==0) continue;
            if((negCnt & 1)==1 && x==maxNeg && !r){
                r=true;
                continue;
            }
            pro=(pro*x)%mod;
            used++;
        }
        if(used==0) return 0;
        return (int)pro;
    }
}