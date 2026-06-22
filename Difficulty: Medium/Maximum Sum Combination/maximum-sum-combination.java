class Solution {
    public ArrayList<Integer> topKSumPairs(int[] a, int[] b, int k) {
        // code here
        int n=a.length;
        ArrayList<Integer> res=new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        
        PriorityQueue<int[]> pq=new PriorityQueue<>((x,y)->y[0]-x[0]);
        pq.add(new int[]{a[n-1]+b[n-1], n-1, n-1});
        
        Set<String> set=new HashSet<>();
        set.add((n-1)+","+(n-1));
        while(k-->0 && !pq.isEmpty()){
            int cur[]=pq.poll();
            int sum=cur[0],i=cur[1],j=cur[2];
            res.add(sum);
            
            if(i-1>=0){
                String key1=(i-1)+","+j;
                if(!set.contains(key1)){
                    pq.add(new int[]{a[i-1]+b[j], i-1, j});
                    set.add((i-1)+","+j);
                }
            }
            if(j-1>=0){
                String key2=i+","+(j-1);
                if(!set.contains(key2)){
                    pq.add(new int[]{a[i]+b[j-1], i, j-1});
                    set.add(i+","+(j-1));
                }
            }
        }
        return res;
    }
}