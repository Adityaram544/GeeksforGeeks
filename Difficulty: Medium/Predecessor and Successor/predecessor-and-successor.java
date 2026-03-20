/*
class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Node> findPreSuc(Node root, int key) {
        // code here
        ArrayList<Integer> in=new ArrayList<>();
        inOrder(root,in);
        Node pre=null;
        Node suc=null;
        for(int i=0;i<in.size();i++){
            if(in.get(i)<key){
                pre=new Node(in.get(i));
            }else if(in.get(i)>key){
                suc=new Node(in.get(i));
                break;
            }
        }
        ArrayList<Node> res=new ArrayList<>();
        res.add(pre);
        res.add(suc);
        return res;
    }
    private void inOrder(Node node,ArrayList<Integer> res){
        if(node==null) return;
        inOrder(node.left,res);
        res.add(node.data);
        inOrder(node.right,res);
    }
}