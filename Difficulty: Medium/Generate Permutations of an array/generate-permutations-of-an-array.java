class Solution {
    public static ArrayList<ArrayList<Integer>> permuteDist(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        backTrack(arr,0,res);
        return res;
    }
    private static void backTrack(int[] arr,int idx,ArrayList<ArrayList<Integer>> res){
        if(idx==arr.length){
            ArrayList<Integer> temp=new ArrayList<>();
            for(int x:arr){
                temp.add(x);
            }
            res.add(temp);
            return;
        }
        for(int i=idx;i<arr.length;i++){
            swap(arr,idx,i);
            backTrack(arr,idx+1,res);
            swap(arr,idx,i);
        }
    }
    private static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
};