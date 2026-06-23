class Solution {
    int maxPeopleDefeated(int p) {
        // code here
        int l=0,h=4000;
        while(l<=h){
            int m=l+(h-l)/2;
            long sum=(long)m *(m+1)*(2L*m+1)/6;
            if(sum<=p){
                l=m+1;
            }else{
                h=m-1;
            }
        }
        return h;
    }
};
