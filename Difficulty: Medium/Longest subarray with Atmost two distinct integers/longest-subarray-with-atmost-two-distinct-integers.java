class Solution {
    public int totalElements(int[] arr) {
        // code here
        int maxLen=0,j=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
            while(mp.size()>2){
                mp.put(arr[j],mp.get(arr[j])-1);
                if(mp.get(arr[j])==0){
                    mp.remove(arr[j]);
                }
                j++;
            }
            maxLen=Math.max(maxLen,i-j+1);
        }
        
        return maxLen;
    }
}