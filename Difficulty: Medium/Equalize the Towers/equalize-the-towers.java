class Solution {
    public int minCost(int[] heights, int[] cost) {
        // code here
        int n=heights.length;
        int l=heights[0],h=heights[0];
        for(int x:heights){
            l=Math.min(l,x);
            h=Math.max(h,x);
        }
        long ans=Long.MAX_VALUE;
        while(l<=h){
            int m=l+(h-l)/2;
            long c1=findCost(cost,heights,m);
            long c2=findCost(cost,heights,m+1);
            ans=Math.min(c1,c2);
            if(c1<c2){
                h=m-1;
            }else{
                l=m+1;
            }
        }
        return (int)ans;
    }
    private long findCost(int cost[],int heights[],int x){
        long total=0;
        for(int i=0;i<heights.length;i++){
            total+=(long)Math.abs(heights[i]-x)*cost[i];
        }
        return total;
    } 
}
