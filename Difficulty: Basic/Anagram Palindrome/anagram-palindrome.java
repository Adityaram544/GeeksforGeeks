class Solution {
    boolean canFormPalindrome(String s) {
        // code here
        int n=s.length();
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int oddCnt=0;
        for(int x:map.values()){
            if(x%2==1){
                oddCnt++;
            }
        }
        return oddCnt<=1;
    }
}