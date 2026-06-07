class Solution {
    public String profession(int level, int pos) {
        // code here
        int f=0;
        while(pos>1){
            if(pos%2==0) f++;
            pos=(pos+1)/2;
        }
        if(f%2==0){
            return "Engineer";
        }else{
            return "Doctor";
        }
    }
}