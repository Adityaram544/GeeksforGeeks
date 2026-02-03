class Solution {
    public int maxProfit(int[] prices) {
        // Code here
        int n=prices.length;
        int bCost=prices[0];
        int profit=0;
        for(int i=1;i<n;i++){
            profit=Math.max(profit,prices[i]-bCost);
            bCost=Math.min(bCost,prices[i]);
        }
        return profit;
    }
}