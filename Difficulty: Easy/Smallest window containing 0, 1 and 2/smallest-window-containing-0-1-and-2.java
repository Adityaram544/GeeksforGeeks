class Solution {
    public int smallestSubstring(String s) {
        // code here
        int res=Integer.MAX_VALUE,l=0;
        int x[]=new int[3];
        for(int r=0;r<s.length();r++){
            x[s.charAt(r)-'0']++;
            while(x[0]>0 && x[1]>0 && x[2]>0){
                res=Math.min(res,r-l+1);
                x[s.charAt(l)-'0']--;
                l++;
            }
        }
        return res==Integer.MAX_VALUE ? -1 : res;
    }
};

