class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        char x[]=s1.toCharArray();
        char y[]=s2.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        if(Arrays.equals(x,y)){
            return true;
        }
        return false;
    }
}