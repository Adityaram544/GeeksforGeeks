// User function Template for Java

class Solution {
    public List<String> AllPossibleStrings(String s) {
        // Code here
        int n=s.length();
        int total=1<<n;
        List<String> res=new ArrayList<>();
        for(int m=0;m<total;m++){
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<n;i++){
                if((m & (1<<i)) !=0){
                    sb.append(s.charAt(i));
                }
            }
            res.add(sb.toString());
        }
        Collections.sort(res);
        return res;
    }
}