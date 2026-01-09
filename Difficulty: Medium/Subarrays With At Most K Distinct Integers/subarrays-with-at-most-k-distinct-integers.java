class Solution {
    public int countAtMostK(int arr[], int k) {
        // code here
        int l=0,cnt=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int r=0;r<arr.length;r++){
            map.put(arr[r],map.getOrDefault(arr[r],0)+1);
            while(map.size()>k){
                map.put(arr[l],map.get(arr[l])-1);
                if(map.get(arr[l])==0){
                    map.remove(arr[l]);
                }
                l++;
            }
            cnt+=r-l+1;
        }
        return cnt;
    }
}
