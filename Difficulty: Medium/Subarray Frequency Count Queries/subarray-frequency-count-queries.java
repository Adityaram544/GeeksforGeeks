class Solution {
    public ArrayList<Integer> freqInRange(int[] arr, int[][] queries) {
        // code here
        Map<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.computeIfAbsent(arr[i],k->new ArrayList<>()).add(i);
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int q[]:queries){
            int l=q[0],r=q[1],x=q[2];
            if(!map.containsKey(x)){
                res.add(0);
                continue;
            }
            ArrayList<Integer> pos=map.get(x);
            int a=lowerBound(pos,l);
            int b=upperBound(pos,r);
            res.add(b-a);
        }
        return res;
    }
    private int lowerBound(ArrayList<Integer> al,int val){
        int l=0,h=al.size()-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(al.get(m)<val){
                l=m+1;
            }else{
                h=m-1;
            }
        }
        return l;
    }
    private int upperBound(ArrayList<Integer> al,int val){
        int l=0,h=al.size()-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(al.get(m)<=val){
                l=m+1;
            }else{
                h=m-1;
            }
        }
        return l;
    }
}