class Solution {
    int maxOnes(int[] arr) {
        // code here
        int n=arr.length;
        int oneCnt=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                arr[i]=-1;
                oneCnt++;
            }else{
                arr[i]=1;
            }
        }
        int res=0;
        int s=0;
        for(int i=0;i<n;i++){
            s+=arr[i];
            res=Math.max(res,s);
            if(s<0){
                s=0;
            }
        }
        return res+oneCnt;
    }
};