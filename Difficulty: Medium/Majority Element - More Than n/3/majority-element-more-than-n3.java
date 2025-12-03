class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // Code here
        int n=arr.length;
        int c1=0,c2=0;
        int el1=Integer.MIN_VALUE;
        int el2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(c1==0 && arr[i]!=el2){
                c1=1;
                el1=arr[i];
            }else if(c2==0 && arr[i]!=el1){
                c2=1;
                el2=arr[i];
            }else if(arr[i]==el1){
                c1++;
            }else if(arr[i]==el2){
                c2++;
            }else{
                c1--;
                c2--;
            }
        }
        ArrayList<Integer> res=new ArrayList<>();
        c1=0;c2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==el1){
                c1++;
            }else if(arr[i]==el2){
                c2++;
            }
        }
        if(c1>(n/3)){
            res.add(el1);
        }
        if(c2>(n/3)){
            res.add(el2);
        }
        Collections.sort(res);
        return res;
    }
}