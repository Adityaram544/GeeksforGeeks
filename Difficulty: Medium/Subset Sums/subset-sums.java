// User function Template for Java//User function Template for Java
class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        helper(0,0,res,arr);
        Collections.sort(res);
        return res;
    }
    private void helper(int idx,int sum,ArrayList<Integer> res,int arr[]){
        if(idx==arr.length){
            res.add(sum);
            return;
        }
        helper(idx+1,sum+arr[idx],res,arr);
        helper(idx+1,sum,res,arr);
    }
}