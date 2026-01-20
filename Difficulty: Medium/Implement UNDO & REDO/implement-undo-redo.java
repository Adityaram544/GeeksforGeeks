class Solution {
    Stack<Character> stk=new Stack<>();
    StringBuilder sb=new StringBuilder();
    public void append(char x) {
        // append x into document
        sb.append(x);
    }

    public void undo() {
        // undo last change
        stk.push(sb.charAt(sb.length()-1));
        sb.deleteCharAt(sb.length()-1);
    }

    public void redo() {
        // redo changes
        sb.append(stk.pop());
    }

    public String read() {
        // read the document
        return sb.toString();
    }
}
