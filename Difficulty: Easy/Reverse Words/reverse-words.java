class Solution {
    public String reverseWords(String s) {
        // Code here
        String str[]=s.split("\\.");
        StringBuilder sb=new StringBuilder();
        for(int i=str.length-1;i>=0;i--){
            if(str[i].length()>0){
                if(sb.length()>0) sb.append(".");
                sb.append(str[i]);
            }
        }
        return sb.toString();
    }
}
