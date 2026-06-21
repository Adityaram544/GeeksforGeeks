class Solution {
    public String chooseSwap(String s) {
        // code here
        int n=s.length();
        boolean pre[]=new boolean[26];
        char ch[]=s.toCharArray();
        for(char c:ch){
            pre[c-'a']=true;
        }
        for(int i=0;i<n;i++){
            pre[ch[i]-'a']=false;
            for(int j=0;j<ch[i]-'a';j++){
                if(pre[j]){
                    char x=ch[i];
                    char y=(char)(j+'a');
                    for(int k=0;k<n;k++){
                        if(ch[k]==x){
                            ch[k]=y;
                        }else if(ch[k]==y){
                            ch[k]=x;
                        }
                    }
                    return new String(ch);
                }
            }
        }
        return s;
    }
}