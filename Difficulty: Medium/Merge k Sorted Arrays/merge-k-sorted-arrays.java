class Solution {
    public ArrayList<Integer> mergeArrays(int[][] mat) {
        // Code here
        ArrayList<Integer> res=new ArrayList<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                pq.add(mat[i][j]);
            }
        }
        int n=pq.size();
        for(int i=0;i<n;i++){
            res.add(pq.poll());
        }
        return res;
    }
}