class Solution {
    public ArrayList<String> findPrefixes(ArrayList<String> arr) {
        // code here
        ArrayList<String> res=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();
        for(String s:arr){
            StringBuilder sb=new StringBuilder();
            for(char c:s.toCharArray()){
                sb.append(c);
                String x=sb.toString();
                map.put(x,map.getOrDefault(x,0)+1);
            }
        }
        for(String s:arr){
            boolean ok=false;
            StringBuilder sb=new StringBuilder();
            for(char c:s.toCharArray()){
                sb.append(c);
                String x=sb.toString();
                if(map.get(x)==1){
                    res.add(x);
                    ok=true;
                    break;
                }
            }
            if(!ok) res.add(s);
        }
        return res;
    }
}