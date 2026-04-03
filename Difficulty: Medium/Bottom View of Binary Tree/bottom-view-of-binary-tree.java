/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
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
    public ArrayList<Integer> bottomView(Node root) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        if(root==null) return res;
        Queue<Pair> q=new LinkedList<>();
        Map<Integer,Integer> map=new TreeMap<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair p=q.poll();
            Node cur=p.node;
            int hd=p.hd;
            map.put(hd,cur.data);
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