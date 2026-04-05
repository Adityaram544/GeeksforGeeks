// User function Template for Java
class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        String res="";
        String x=arr[0];
        for(int i=0;i<x.length();i++){
            char c=x.charAt(i);
            for(int j=1;j<arr.length;j++){
                if(i>=arr[j].length() || c!=arr[j].charAt(i)){
                    return res;
                }
            }
            res+=c;
        }
        return res;
    }
}