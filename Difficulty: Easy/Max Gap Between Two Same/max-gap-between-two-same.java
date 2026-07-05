class Solution {
    public int maxCharGap(String s) {
        // code here
        Map<Character,List<Integer>> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.computeIfAbsent(s.charAt(i),k->new ArrayList<>()).add(i);
        }
        int res=-1;
        for(List<Integer> lst:map.values()){
            if(lst.size()>1){
                int gap=lst.get(lst.size()-1)-lst.get(0)-1;
                res=Math.max(res,gap);
            }
        }
        return res;
    }
};
