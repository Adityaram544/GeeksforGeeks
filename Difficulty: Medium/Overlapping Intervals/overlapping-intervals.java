class Solution {
    public ArrayList<int[]> mergeOverlap(int[][] arr) {
        // Code here
        int n=arr.length;
        ArrayList<int[]> res=new ArrayList<>();
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        int cur[]=arr[0];
        res.add(cur);
        for(int i=1;i<n;i++){
            int s=arr[i][0];
            int e=arr[i][1];
            if(s<=cur[1]){
                cur[1]=Math.max(cur[1],e);
            }else{
                cur=arr[i];
                res.add(cur);
            }
        }
        return res;
    }
}