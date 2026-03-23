class Solution {
    public int reverseExponentiation(int n) {
        // code here
        int temp=n;
        int rev=0;
        while(temp!=0){
            int t=temp%10;
            rev=rev*10+t;
            temp/=10;
        }
        int res=1;
        for(int i=0;i<rev;i++){
            res*=n;
        }
        return res;
    }
}
