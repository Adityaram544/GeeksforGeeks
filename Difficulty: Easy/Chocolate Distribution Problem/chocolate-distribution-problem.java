class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        Collections.sort(arr);
        int minDiff=Integer.MAX_VALUE;
        for(int i=0;i<=arr.size()-m;i++){
            minDiff=Math.min(minDiff,arr.get(i+m-1)-arr.get(i));
        }
        return minDiff;
    }
}