class Solution {
    public boolean canSeatAllPeople(int k, int[] seats) {
        // code here
        int n=seats.length,i=0;
        while(i<n && k>0){
            if(seats[i]==0){
                int l=(i==0) ? 0 : seats[i-1];
                int r=(i==n-1) ? 0 : seats[i+1];
                if(l==0 && r==0){
                    seats[i]=1;
                    k--;
                }
            }
            i++;
        }
        return k==0;
    }
}