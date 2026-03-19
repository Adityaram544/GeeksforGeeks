class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        Set<Integer> set=new HashSet<>();
        for(int x:arr){
            set.add(x);
        }
        int maxLen=1;
        for(int i:arr){
            if(!set.contains(i-1)){
                int cnt=1;
                int x=i;
                while(set.contains(x+1)){
                    x++;
                    cnt++;
                }
                maxLen=Math.max(cnt,maxLen);
            }
        }
        return maxLen;
    }
}