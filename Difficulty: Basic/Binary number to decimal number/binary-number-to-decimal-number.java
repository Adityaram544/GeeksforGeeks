// User function Template for Java

class Solution {
    public int binaryToDecimal(String b) {
        // Code here
        int n=b.length();
        int res=0;
        for(int i=n-1;i>=0;i--){
            res+=(b.charAt(i)-'0')*((int)Math.pow(2,n-i-1));
        }
        return res;
    }
}