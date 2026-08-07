class Solution {
    public int countFriendsPairings(int n) {
        // code here
        if(n<=2) return n;
        int pre2=1;
        int pre1=2;
        for(int i=3;i<=n;i++){
            int temp=pre1+pre2*(i-1);
            pre2=pre1;
            pre1=temp;
        }
        return pre1;
    }
}
