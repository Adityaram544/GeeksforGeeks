// User function Template for Java

class Solution {
    // Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n) {
        // add your code
        Map<String,Integer> map=new HashMap<>();
        for(String x:arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        String name="";
        int c=0;
        for(String x:map.keySet()){
            int votes=map.get(x);
            if(votes>c){
                c=votes;
                name=x;
            }else if(votes==c){
                if(x.compareTo(name)<0){
                    name=x;
                }
            }
        }
        return new String[]{name,String.valueOf(c)};
    }
}
