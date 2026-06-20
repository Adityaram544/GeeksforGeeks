class Solution {
    public int median(int[][] mat) {
        // code here
        List<Integer> lst=new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                lst.add(mat[i][j]);
            }
        }
        Collections.sort(lst);
        return lst.get(lst.size()/2);
    }
}