class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        int n=arr.length;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        int maxLen=0;
        for(int x:arr){
            int cnt=0;
            while(set.contains(x)){
                cnt++;
                x--;
            }
            maxLen=Math.max(maxLen,cnt);
        }
        return maxLen;
    }
}