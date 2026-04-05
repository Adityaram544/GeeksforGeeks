class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(map.get(x)==1){
                return x;
            }
        }
        return '$';
    }
}
