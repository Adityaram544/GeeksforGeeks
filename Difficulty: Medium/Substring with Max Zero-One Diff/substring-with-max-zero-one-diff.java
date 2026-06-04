class Solution {
    int maxSubstring(String s) {
        // code here
        int maxS=-1,sum=0;
        for(int i=0;i<s.length();i++){
            int x=(s.charAt(i)=='0') ? 1 : -1;
            sum+=x;
            maxS=Math.max(maxS,sum);
            if(sum<0) sum=0;
        }
        return maxS;
    }
}