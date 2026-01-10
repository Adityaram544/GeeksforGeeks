class Solution {
    public static String infixToPostfix(String s) {
        // code here
        Stack<Character> stk=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sb.append(ch);
            }else if(ch=='('){
                stk.push(ch);
            }else if(ch==')'){
                while(!stk.isEmpty() && stk.peek()!='('){
                    sb.append(stk.pop());
                }
                stk.pop();
            }else{
                while(!stk.isEmpty() && (priority(ch)<priority(stk.peek()) ||
                (priority(ch)==priority(stk.peek()) && ch!='^'))){
                    sb.append(stk.pop());
                }
                stk.push(ch);
            }
        }
        while(!stk.isEmpty()){
            sb.append(stk.pop());
        }
        return sb.toString();
    }
    private static int priority(char c){
        if(c=='^') return 3;
        else if(c=='*' || c=='/') return 2;
        else if(c=='+' || c=='-') return 1;
        else return -1;
    }
}