class Solution {
    static ArrayList<Integer> diagView(int mat[][]) {
        // code here
        int n=mat.length;
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            int j=0,k=i;
            while(j<n && k>=0){
                res.add(mat[j][k]);
                j++;
                k--;
            }
        }
        for(int i=1;i<n;i++){
            int j=i,k=n-1;
            while(j<n && k>=0){
                res.add(mat[j][k]);
                j++;
                k--;
            }
        }
        return res;
    }
}

// 00
// 01 10
// 02 11 20
// 12 21 
// 22


/*
     1  2  3  4
     5  6  7  8
     9  10 11 12
     13 14 15 16
     
     00 
     01 10 
     02 11 20
     03 12 21 30
     13 22 31
     23 32
     33
     
*/