class Solution {
    public ArrayList<String> graycode(int n) {
        // code here
        ArrayList<String> res=new ArrayList<>();
        for(int i=0;i<(int)Math.pow(2,n);i++){
            int xor=i^(i>>1);
            String bin=Integer.toBinaryString(xor);
            StringBuilder sb=new StringBuilder();
            if(bin.length()<n){
                for(int j=1;j<=n-bin.length();j++){
                    sb.append("0");
                }
            }
            sb.append(bin);
            res.add(sb.toString());
        }
        return res;
    }
}