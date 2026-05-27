class Solution {
    public boolean wifiRange(String s, int x) {
        // code here
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0'){
                int l=Math.max(0,i-x);
                int r=Math.min(n,i+x+1);
                boolean b=s.substring(l,r).contains("1");
                if(!b){
                    return false;
                }
            }
        }
        return true;
    }
}