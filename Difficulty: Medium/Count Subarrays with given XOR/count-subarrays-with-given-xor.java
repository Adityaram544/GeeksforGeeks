class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        Map<Integer,Integer> map=new HashMap<>();
        int xor=0;
        long cnt=0;
        for(int x:arr){
            xor^=x;
            if(xor==k){
                cnt++;
            }
            cnt+=map.getOrDefault(xor^k,0);
            map.put(xor,map.getOrDefault(xor,0)+1);
        }
        return cnt;
    }
}