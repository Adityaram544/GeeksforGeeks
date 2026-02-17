
class Solution {
    public static int overlapInt(int[][] arr) {
        // code here
        int n=arr.length;
        int st[]=new int[n];
        int end[]=new int[n];
        for(int i=0;i<n;i++){
            st[i]=arr[i][0];
            end[i]=arr[i][1];
        }
        Arrays.sort(st);
        Arrays.sort(end);
        int i=0,j=0;
        int cur=0;
        int maxLaps=0;
        while(i<n && j<n){
            if(st[i]<=end[j]){
                cur++;
                maxLaps=Math.max(maxLaps,cur);
                i++;
            }else{
                cur--;
                j++;
            }
        }
        return maxLaps;
    }
}
