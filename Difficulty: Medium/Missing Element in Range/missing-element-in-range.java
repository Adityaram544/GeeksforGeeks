class Solution {
    public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        // code here
        Set<Integer> set=new HashSet<>();
        for(int x:arr){
            set.add(x);
        }
        ArrayList<Integer> res=new ArrayList<>();
        while(low<=high){
            if(!set.contains(low)){
                res.add(low);
            }
            low++;
        }
        return res;
    }
}