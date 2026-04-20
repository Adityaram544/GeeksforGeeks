class Solution {
    public int derangeCount(int n) {
        // code here
        if(n==1) return 0;
        if(n==2) return 1;
        int pre2=0;
        int pre1=1;
        for(int i=3;i<=n;i++){
            int cur=(i-1)*(pre1+pre2);
            pre2=pre1;
            pre1=cur;
        }
        return pre1;
    }
};