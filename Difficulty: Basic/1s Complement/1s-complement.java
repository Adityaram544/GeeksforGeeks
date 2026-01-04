// User function Template for Java
class Solution {
    static String onesComplement(String S, int N) {
        // code here
        StringBuilder sb=new StringBuilder();
        for(char c:S.toCharArray()){
            if(c=='1') sb.append("0");
            else sb.append("1");
        }
        return sb.toString();
    }
}