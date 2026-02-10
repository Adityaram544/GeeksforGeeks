class Solution {
    public int kokoEat(int[] arr, int k) {
        // code here
        int maxP=0;
        for(int x:arr){
            maxP=Math.max(maxP,x);
        }
        int l=0,h=maxP;
        while(l<=h){
            int m=l+(h-l)/2;
            long hrs=0;
            for(int x:arr){
                hrs+=Math.ceil((double)x/m);
            }
            if(hrs<=k){
                h=m-1;
            }else{
                l=m+1;
            }
        }
        return l;
    }
}
