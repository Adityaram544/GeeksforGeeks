class Solution {
    public ArrayList<Integer> maxOfMins(int[] arr) {
        // code here
        int n=arr.length;
        int pse[]=new int[n];
        int nse[]=new int[n];
        int ans[]=new int[n+1];
        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<n;i++){
            while(!stk.isEmpty() && arr[stk.peek()]>=arr[i]){
                stk.pop();
            }
            pse[i]=stk.isEmpty() ? -1 : stk.peek();
            stk.push(i);
        }
        stk.clear();
        for(int i=n-1;i>=0;i--){
            while(!stk.isEmpty() && arr[stk.peek()]>=arr[i]){
                stk.pop();
            }
            nse[i]=stk.isEmpty() ? n : stk.peek();
            stk.push(i);
        }
        stk.clear();
        for(int i=0;i<n;i++){
            int len=nse[i]-pse[i]-1;
            ans[len]=Math.max(ans[len],arr[i]);
        }
        for(int i=n-1;i>=0;i--){
            ans[i]=Math.max(ans[i],ans[i+1]);
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=1;i<=n;i++){
            res.add(ans[i]);
        }
        return res;
    }
}