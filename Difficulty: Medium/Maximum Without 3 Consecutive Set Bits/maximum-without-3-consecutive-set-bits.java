class Solution {
    public int maxValue(int n) {
        // code here
        String s=Integer.toBinaryString(n);
        StringBuilder res=new StringBuilder();
        int cnt=0;
        for(char c:s.toCharArray()){
            if(c=='1'){
                cnt++;
                if(cnt==3){
                    cnt=0;
                    res.append('0');
                }else{
                    res.append('1');
                }
            }else{
                cnt=0;
                res.append('0');
            }
        }
        return Integer.parseInt(res.toString(),2);
    }
}