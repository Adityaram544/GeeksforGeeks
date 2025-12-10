class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int n=arr.length;
        int x[]=new int[n+1];
        for(int i:arr){
            x[i]++;
        }
        int f=-1,s=-1;
        for(int i=1;i<=n;i++){
            if(x[i]==2) f=i;
            if(x[i]==0) s=i;
        }
        return new ArrayList<>(Arrays.asList(f,s));
    }
}
