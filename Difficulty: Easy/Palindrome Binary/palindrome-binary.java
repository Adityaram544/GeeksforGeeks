class Solution {
    public boolean isBinaryPalindrome(int n) {
        // code here
        String s=Integer.toBinaryString(n);
        int l=0,r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
};