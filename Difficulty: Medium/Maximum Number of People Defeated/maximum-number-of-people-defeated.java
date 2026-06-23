class Solution {
    int maxPeopleDefeated(int p) {
        // code here
        int cnt=0,i=1;
        while(i*i<=p){
            p-=i*i;
            cnt++;
            i++;
        }
        return cnt;
    }
};