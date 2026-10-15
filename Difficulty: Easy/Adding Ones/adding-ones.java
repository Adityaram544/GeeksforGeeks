class Solution {
    public ArrayList<Integer> update(int n, int[] updates) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            res.add(0);
        }
        for(int x:updates){
            res.set(x-1,res.get(x-1)+1);
        }
        int cSum=0;
        for(int i=0;i<n;i++){
            cSum+=res.get(i);
            res.set(i,cSum);
        }
        return res;

    }
}