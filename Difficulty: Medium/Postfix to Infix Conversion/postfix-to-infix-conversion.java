// User function Template for Java

class Solution {
    static String postToInfix(String exp) {
        // code here
        Stack<String> stk=new Stack<>();
        for(int i=0;i<exp.length();i++){
            char c=exp.charAt(i);
            if(Character.isLetterOrDigit(c)){
                stk.push(String.valueOf(c));
            }else{
                String s1=stk.pop();
                String s2=stk.pop();
                stk.push('(' + s2 + c + s1 + ')');
            }
        }
        return stk.peek();
    }
}
