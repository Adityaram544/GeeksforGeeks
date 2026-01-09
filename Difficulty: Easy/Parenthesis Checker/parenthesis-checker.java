class Solution {
    public boolean isBalanced(String s) {
        // code here
        Stack<Character> stk=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='(' || c=='[' || c=='{'){
                stk.add(c);
            }else{
                if(stk.isEmpty()) return false;
                if((c==')' && stk.pop()!='(') || 
                   (c==']' && stk.pop()!='[') ||
                   (c=='}' && stk.pop()!='{')){
                    return false;
                }
            }
        }
        return stk.isEmpty();
    }
}
