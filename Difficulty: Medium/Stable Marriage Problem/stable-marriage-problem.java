class Solution {
    public int[] stableMarriage(int[][] men, int[][] women) {
        // code here
        int n=men.length;
        int wPartner[]=new int[n];
        int mPartner[]=new int[n];
        int nextPro[]=new int[n];
        for(int i=0;i<n;i++){
            wPartner[i]=-1;
        }
        int rank[][]=new int[n][n];
        for(int w=0;w<n;w++){
            for(int i=0;i<n;i++){
                rank[w][women[w][i]]=i;
            }
        }
        Queue<Integer> freeMen=new LinkedList<>();
        for(int i=0;i<n;i++){
            freeMen.add(i);
        }
        while(!freeMen.isEmpty()){
            int m=freeMen.poll();
            int w=men[m][nextPro[m]];
            nextPro[m]++;
            if(wPartner[w]==-1){
                wPartner[w]=m;
                mPartner[m]=w;
            }else{
                int m2=wPartner[w];
                if(rank[w][m]<rank[w][m2]){
                    wPartner[w]=m;
                    mPartner[m]=w;
                    freeMen.add(m2);
                }else{
                    freeMen.add(m);
                }
            }
        }
        return mPartner;
    }
}