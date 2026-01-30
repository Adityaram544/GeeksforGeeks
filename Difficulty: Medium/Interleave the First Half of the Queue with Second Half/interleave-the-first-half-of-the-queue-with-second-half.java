class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        // code here
        int n=q.size();
        Queue<Integer> qq=new LinkedList<>();
        for(int i=0;i<n/2;i++){
            qq.add(q.poll());
        }
        while(qq.size()!=0){
            q.add(qq.poll());
            q.add(q.poll());
        }
    }
}
