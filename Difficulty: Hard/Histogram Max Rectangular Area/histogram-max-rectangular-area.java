class Solution {
    public static int getMaxArea(int arr[]) {
        // code here
        int n=arr.length;
        int maxArea=0;
        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<n;i++){
            while(!stk.isEmpty() && arr[stk.peek()]>arr[i]){
                int ele=stk.pop();
                int pse=stk.isEmpty() ? -1 : stk.peek();
                int nse=i;
                maxArea=Math.max(maxArea,arr[ele]*(nse-pse-1));
            }
            stk.push(i);
        }
        while(!stk.isEmpty()){
            int nse=n;
            int ele=stk.pop();
            int pse=stk.isEmpty() ? -1 : stk.peek();
            maxArea=Math.max(maxArea,arr[ele]*(nse-pse-1));
        }
        return maxArea;
    }
}
