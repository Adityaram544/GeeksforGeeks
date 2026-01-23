class Solution {
    int majorityElement(int arr[]) {
        // code here
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int k:map.keySet()){
            if(map.get(k)>n/2){
                return k;
            }
        }
        return -1;
    }
}