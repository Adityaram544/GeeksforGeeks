class Solution {
    public int longestSubstr(String s, int k) {
        // code here
        int l=0,r=0;
        int maxRes=0;
        int maxFre=0;
        char cnt[]=new char[26];
        while(r<s.length()){
            cnt[s.charAt(r)-'A']++;
            maxFre=Math.max(maxFre,cnt[s.charAt(r)-'A']);
            while((r-l+1)-maxFre>k){
                cnt[s.charAt(l)-'A']--;
                l++;
            }
            maxRes=Math.max(maxRes,r-l+1);
            r++;
        }
        return maxRes;
    }
}
