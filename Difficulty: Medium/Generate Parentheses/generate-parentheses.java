// User function Template for Java

class Solution {

    public ArrayList<String> generateParentheses(int n) {
        // code here
        ArrayList<String> res=new ArrayList<>();
        fun(res,0,0,"",n/2);
        return res;
    }
    private void fun(ArrayList<String> res,int open,int close,String s,int n){
        if(s.length()==2*n){
            res.add(s);
            return;
        }
        if(open<n){
            fun(res,open+1,close,s+"(",n);
        }
        if(close<open){
            fun(res,open,close+1,s+")",n);
        }
    }
}