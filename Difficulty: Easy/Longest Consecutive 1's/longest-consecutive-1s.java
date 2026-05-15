class Solution {
    public static int maxConsecutiveOnes(int n) {
        // code here
        String s=Integer.toBinaryString(n);
        int maxLen=0,cnt=0;
        for(int r=0;r<s.length();r++){
            if(s.charAt(r)=='1'){
                cnt++;
                maxLen=Math.max(maxLen,cnt);
            }else{
                cnt=0;
            }
        }
        return maxLen;
    }
}
