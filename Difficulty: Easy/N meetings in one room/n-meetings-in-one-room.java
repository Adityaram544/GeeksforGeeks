class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int start[], int end[]) {
        // add your code here
        int maxM=1;
        int n=start.length;
        int pair[][]=new int[n][2];
        for(int i=0;i<n;i++){
            pair[i][0]=start[i];
            pair[i][1]=end[i];
        }
        Arrays.sort(pair,(a,b)->Integer.compare(a[1],b[1]));
        int x=pair[0][1];
        for(int i=1;i<n;i++){
            if(pair[i][0]>x){
                maxM++;
                x=pair[i][1];
            }
        }
        return maxM;
    }
}

/*
1 3 0 5 5 8
2 4 6 7 9 9
*/
