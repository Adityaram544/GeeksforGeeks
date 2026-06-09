class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        Map<Integer,Integer> map=new HashMap<>();
        long cnt=0;
        int xor=0,l=0;
        for(int r=0;r<arr.length;r++){
            xor^=arr[r];
            if(xor==k) cnt++;
            cnt+=map.getOrDefault(xor^k,0);
            map.put(xor,map.getOrDefault(xor,0)+1);
        }
        return cnt;
    }
}
/*
0100
0110
*/