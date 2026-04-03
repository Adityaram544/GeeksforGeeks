/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/
class Solution {
    static class Pair{
        Node node;
        int hd;
        Pair(Node n,int h){
            node=n;
            hd=h;
        }
    }
    public ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        if(root==null) return res;
        
        Map<Integer,Integer> map=new TreeMap<>();
        Queue<Pair> q=new LinkedList<>();
        
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair p=q.poll();
            Node cur=p.node;
            int hd=p.hd;
            if(!map.containsKey(hd)){
                map.put(hd,cur.data);
            }
            if(cur.left!=null){
                q.add(new Pair(cur.left,hd-1));
            }
            if(cur.right!=null){
                q.add(new Pair(cur.right,hd+1));
            }
        }
        res.addAll(map.values());
        return res;
    }
}