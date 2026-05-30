class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
        int n=val.length;
        double wts[][]=new double[n][2];
        for(int i=0;i<n;i++){
            wts[i][0]=(double) val[i]/wt[i];
            wts[i][1]=i;
        }
        Arrays.sort(wts,(a,b)->Double.compare(b[0],a[0]));
        double pro=0;
        int i=0;
        while(i<n && capacity>0){
            int idx=(int) wts[i][1];
            if(wt[idx]<=capacity){
                capacity-=wt[idx];
                pro+=val[idx];
            }else{
                pro+=capacity*wts[i][0];
                capacity=0;
            }
            i++;
        }
        return pro;
    }
}

/*
120 30
100 20
60  10
*/