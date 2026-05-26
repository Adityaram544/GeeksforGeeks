class Solution {
    int minToggle(int[] arr) {
        // code here
        int totalZ=0;
        for(int x:arr){
            if(x==0) totalZ++;
        }
        int lOnes=0;
        int rZeroes=totalZ;
        int res=rZeroes;
        for(int x:arr){
            if(x==1) lOnes++;
            else rZeroes--;
            res=Math.min(res,lOnes+rZeroes);
        }
        return res;
    }
}