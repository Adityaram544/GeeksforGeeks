class Solution {
    public boolean kSubstr(String s, int k) {
        // code here
        int n=s.length();
        if(n%k!=0) return false;
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<n;i+=k){
            String str=s.substring(i,i+k);
            map.put(str,map.getOrDefault(str,0)+1);
        }
        if(map.size()==1) return true;
        if(map.size()==2 && map.containsValue(1)) return true;
        return false;
    }
}