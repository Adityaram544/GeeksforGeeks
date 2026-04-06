class Solution {
    public String multiplyStrings(String s1, String s2) {
        // code here
        boolean sign=false;
        if(s1.charAt(0)=='-'){
            sign=!sign;
            s1=s1.substring(1);
        }
        if(s2.charAt(0)=='-'){
            sign=!sign;
            s2=s2.substring(1);
        }
        s1=removeLeadingZeroes(s1);
        s2=removeLeadingZeroes(s2);
        if(s1.equals("0") || s2.equals("0")) return "0";
        int n=s1.length(),m=s2.length();
        
        String res="0";
        for(int j=m-1;j>=0;j--){
            int d2=s2.charAt(j)-'0';
            StringBuilder temp=new StringBuilder();
            for(int k=0;k<m-1-j;k++){
                temp.append("0");
            }
            int carry=0;
            for(int i=n-1;i>=0;i--){
                int d1=s1.charAt(i)-'0';
                int mul=d1*d2+carry;
                temp.append(mul%10);
                carry=mul/10;
            }
            if(carry>0) temp.append(carry);
            temp.reverse();
            res=addStrings(res,temp.toString());
        }
        if(sign) res="-"+res;
        return res;
    }
    
    private String addStrings(String a,String b){
        StringBuilder sb=new StringBuilder();
        int i=a.length()-1,j=b.length()-1;
        int carry=0;
        while(i>=0 || j>=0 || carry>0){
            int sum=carry;
            if(i>=0) sum+=a.charAt(i--)-'0';
            if(j>=0) sum+=b.charAt(j--)-'0';
            sb.append(sum%10);
            carry=sum/10;
        }
        return sb.reverse().toString();
    }
    
    private String removeLeadingZeroes(String s){
        int i=0;
        while(i<s.length() && s.charAt(i)=='0'){
            i++;
        }
        return (i==s.length()) ? "0" : s.substring(i);
    }
}