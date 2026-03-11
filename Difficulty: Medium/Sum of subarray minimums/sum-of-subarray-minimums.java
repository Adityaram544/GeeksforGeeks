class Solution {
    public int sumSubMins(int[] arr) {
        // code here
        int n=arr.length;
        Stack<Integer> stk=new Stack<>();
        int left[]=new int[n];
        for(int i=0;i<n;i++){
            while(!stk.isEmpty() && arr[stk.peek()]>arr[i]){
                stk.pop();
            }
            left[i]=stk.isEmpty() ? -1 : stk.peek();
            stk.push(i);
        }
        stk.clear();
        
        int right[]=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!stk.isEmpty() && arr[stk.peek()]>=arr[i]){
                stk.pop();
            }
            right[i]=stk.isEmpty() ? n : stk.peek(); 
            stk.push(i);
        }
        long sum=0;
        for(int i=0;i<n;i++){
            int x=i-left[i];
            int y=right[i]-i;
            sum+=(long)arr[i] * x * y;
        }
        return (int)sum;
    }
}
