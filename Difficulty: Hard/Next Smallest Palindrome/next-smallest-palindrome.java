class Solution {
    static int[] nextPalindrome(int[] num) {
        // code here
        int n=num.length;
        int res[]=num.clone();
        for(int i=0;i<n/2;i++){
            res[n-1-i]=res[i];
        }
        boolean g=false;
        for(int i=0;i<n;i++){
            if(res[i]>num[i]){
                g=true;
                break;
            }else if(res[i]<num[i]){
                break;
            }
        }
        if(g) return res;
        int carry=1;
        int mid=n/2;
        if(n%2==1){
            res[mid]+=carry;
            carry=res[mid]/10;
            res[mid]%=10;
            mid--;
        }else{
            mid=n/2-1;
        }
        while(mid>=0 && carry>0){
            res[mid]+=carry;
            carry=res[mid]/10;
            res[mid]%=10;
            res[n-1-mid]=res[mid];
            mid--;
        }
        if(carry>0){
            int ans[]=new int[n+1];
            ans[0]=1;
            ans[n]=1;
            return ans;
        }
        for(int i=0;i<n/2;i++){
            res[n-1-i]=res[i];
        }
        return res;
    }
}