class Solution {
    ArrayList<Integer> intersection(int[] a, int[] b) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        Set<Integer> set1=new HashSet<>();
        for(int x:a){
            set1.add(x);
        }
        Set<Integer> set2=new LinkedHashSet<>();
        for(int x:b){
            if(set1.contains(x)){
                set2.add(x);
            }
        }
        res.addAll(set2);
        return res;
    }
}