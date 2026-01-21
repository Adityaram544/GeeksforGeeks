class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!stk.isEmpty() && arr[stk.peek()]<=arr[i]){
                stk.pop();
            }
            if(stk.isEmpty()){
                res.add(i+1);
            }else{
                res.add(i-stk.peek());
            }
            stk.push(i);
        }
        return res;
    }
}