class Solution {
    public int romanToDecimal(String s) {
        // code here
        int n=s.length();
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int res=map.get(s.charAt(n-1));
        for(int i=n-2;i>=0;i--){
            int x=map.get(s.charAt(i));
            if(x<res && s.charAt(i)!=s.charAt(i+1)){
                res-=x;
            }else{
                res+=x;
            }
        }
        return res;
    }
}