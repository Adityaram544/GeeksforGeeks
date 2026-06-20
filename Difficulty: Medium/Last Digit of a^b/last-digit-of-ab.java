class Solution {
    public int getLastDigit(String a, String b) {
        // code here
        if(b.equals("0")) return 1;
        int lastD=a.charAt(a.length()-1)-'0';
        int mod=0;
        for(int i=0;i<b.length();i++){
            int c=b.charAt(i)-'0';
            mod=(mod*10+c)%4;
        }
        if(mod==0) mod=4;
        int res=1;
        for(int i=0;i<mod;i++){
            res=(res*lastD)%10;
        }
        return res;
    }
};