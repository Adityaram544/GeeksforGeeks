// User function Template for Java
class Solution {
    static int onesComplement(int N) {
        // code here
        String s=convertToBin(N);
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='1') sb.append('0');
            else sb.append('1');
        }
        s=new String(sb);
        return convertToInt(s);
        
    }
    static String convertToBin(int n){
        StringBuilder sb=new StringBuilder();
        while(n>0){
            sb.append(n%2);
            n=n/2;
        }
        return sb.reverse().toString();
    }
    static int convertToInt(String s){
        int n=s.length();
        int res=0;
        for(int i=n-1;i>=0;i--){
            res+=(s.charAt(i)-'0') * Math.pow(2,n-i-1);
        }
        return res;
    }
}