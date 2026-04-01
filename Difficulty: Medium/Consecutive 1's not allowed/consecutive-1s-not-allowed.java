class Solution {
    int countStrings(int n) {
        // code here
        if(n==1) return 2;
        if(n==2) return 3;
        int f1=2,f2=3;
        for(int i=3;i<=n;i++){
            int f=f1+f2;
            f1=f2;
            f2=f;
        }
        return f2;
    }
}