class Solution {
    public String removeKdig(String s, int k) {
        // code here
        Stack<Character> stk=new Stack<>();
        for(char c:s.toCharArray()){
            while(!stk.isEmpty() && k>0 && c<stk.peek()){
                stk.pop();
                k--;
            }
            stk.push(c);
        }
        while(k>0 && !stk.isEmpty()){
            stk.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder();
        while(!stk.isEmpty()){
            sb.append(stk.pop());
        }
        sb.reverse();
        while(sb.length()>0 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        return sb.length()==0 ? "0" : sb.toString();
    }
}