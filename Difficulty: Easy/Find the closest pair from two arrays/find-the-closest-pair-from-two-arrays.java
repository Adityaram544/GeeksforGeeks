class Solution {
    public static ArrayList<Integer> findClosestPair(int arr1[], int arr2[], int x) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        int n=arr1.length;
        int m=arr2.length;
        int i=0,j=m-1;
        int minDiff=Integer.MAX_VALUE;
        while(i<n && j>=0){
            int sum=arr1[i]+arr2[j];
            int diff=Math.abs(sum-x);
            if(diff<minDiff){
                minDiff=diff;
                res=new ArrayList<>(Arrays.asList(arr1[i],arr2[j]));
            }
            if(sum==x){
                return res;
            }else if(sum<x){
                i++;
            }else{
                j--;
            }
        }
        return res;
    }
}