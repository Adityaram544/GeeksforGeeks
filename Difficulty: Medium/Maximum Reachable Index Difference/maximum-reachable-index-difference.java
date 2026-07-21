class Solution {
    public int maxIndexDifference(String s) {
        // code here
        int n=s.length();
        int st=-1;
        for(int i=0;i<n;i++){
            if(s.charAt(i)!='a') continue;
            st=i;
            break;
        }
        if(st==-1) return -1;
        int next=1;
        int last_match=-1;
        for(int i=st+1;i<n;i++){
            int d=s.charAt(i)-'a';
            if(last_match!=-1 && d==next+1) next=d;
            if(d!=0 && d<=next) last_match=i;
        }
        if(last_match==-1) return 0;
        return last_match-st;
    }
}