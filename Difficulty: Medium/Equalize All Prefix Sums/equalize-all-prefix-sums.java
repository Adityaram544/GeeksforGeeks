class Solution {
    public ArrayList<Integer> optimalArray(int[] arr) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        res.add(0);
        for(int i=1;i<arr.length;i++){
            int x=res.get(i-1)+(arr[i]-arr[i/2]);
            res.add(x);
        }
        return res;
    }
}