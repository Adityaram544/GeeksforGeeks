class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        Set<Integer> set=new HashSet<>();
        for(int x:a){
            set.add(x);
        }
        for(int x:b){
            set.add(x);
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int x:set){
            res.add(x);
        }
        Collections.sort(res);
        return res;
    }
}
