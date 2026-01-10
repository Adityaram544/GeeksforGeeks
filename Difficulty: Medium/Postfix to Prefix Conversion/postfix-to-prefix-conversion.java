// User function Template for Java

class Solution {
    static String postToPre(String post_exp) {
        // code here
        Stack<String> stk=new Stack<>();
        for(int i=0;i<post_exp.length();i++){
            char c=post_exp.charAt(i);
            if(Character.isLetterOrDigit(c)){
                stk.push(String.valueOf(c));
            }else{
                String s1=stk.pop();
                String s2=stk.pop();
                stk.push(c + s2 + s1);
            }
        }
        return stk.peek();
    }
}
