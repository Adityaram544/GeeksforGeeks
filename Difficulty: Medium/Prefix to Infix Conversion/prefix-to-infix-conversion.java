// User function Template for Java

class Solution {
    static String preToInfix(String pre_exp) {
        // code here
        Stack<String> stk=new Stack<>();
        for(int i=pre_exp.length()-1;i>=0;i--){
            char c=pre_exp.charAt(i);
            if(Character.isLetterOrDigit(c)){
                stk.push(String.valueOf(c));
            }else{
                String s1=stk.pop();
                String s2=stk.pop();
                stk.push('(' + s1 + c + s2 + ')');
            }
        }
        return stk.peek();
    }
}
