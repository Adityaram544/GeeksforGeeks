class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        int n=arr.length;
        ArrayList<Integer> res=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        for(int r=0;r<n;r++){
            if(!set.contains(arr[r])){
                res.add(arr[r]);
            }
            set.add(arr[r]);
        }
        return res;
    }
}
