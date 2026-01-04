class Solution {
    static String decToBinary(int n) {
        // code here
        StringBuilder sb=new StringBuilder();
        while(n>0){
            sb.append(n%2);
            n=n/2;
        }
        String s=new String(sb);
        char c[]=s.toCharArray();
        int x=s.length();
        for(int i=0;i<x/2;i++){
            char temp=c[i];
            c[i]=c[x-i-1];
            c[x-i-1]=temp;
        }
        return new String(c);
    }
}