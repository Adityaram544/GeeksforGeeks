class Solution {
    public ArrayList<Integer> constructList(int[][] queries) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        res.add(0);
        int xor=0;
        for(int a[]:queries){
            int x=a[0],y=a[1];
            if(x==0) res.add(y^xor);
            else xor^=y;
        }
        for(int i=0;i<res.size();i++){
            res.set(i,res.get(i)^xor);
        }
        Collections.sort(res);
        return res;
    }
}