class Solution {
    public static int firstRepeated(int[] arr) {
        // code here
        int res=Integer.MAX_VALUE;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                res=Math.min(res,map.get(arr[i]));
            }else{
                map.put(arr[i],i+1);
            }
        }
        return res==Integer.MAX_VALUE ? -1 : res;
    }
}
