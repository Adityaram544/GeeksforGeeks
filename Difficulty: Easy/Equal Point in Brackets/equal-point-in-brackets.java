class Solution {
    public int findIndex(String s) {
        // code here
        int n=s.length();
        int closed=0,open=0;
        for(char c:s.toCharArray()){
            if(c==')') closed++;
        }
        for(int i=0;i<n;i++){
            if(open==closed) return i;
            if(s.charAt(i)=='(') open++;
            else closed--; 
        }
        return n;
    }
}