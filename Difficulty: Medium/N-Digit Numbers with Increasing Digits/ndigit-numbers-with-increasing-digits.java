class Solution {
    public static ArrayList<Integer> increasingNumbers(int n) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        if(n==0 || n>9) return res;
        solve(n,0,res);
        if(n==1){
            res.add(0,0);
        }
        return res;
    }
    private static void solve(int n,int cur,ArrayList<Integer> res){
        if(n==0){
            res.add(cur);
            return;
        }
        int lastD=cur%10;
        for(int d=lastD+1;d<=9;d++){
            cur=cur*10+d;
            solve(n-1,cur,res);
            cur=cur/10;
        }
    }
}


