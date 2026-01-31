/*
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    ArrayList<Integer> boundaryTraversal(Node root) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        if(root==null) return res;
        if(!isLeaf(root)) res.add(root.data);
        addLeftBoundary(root,res);
        addLeafNodes(root,res);
        addRightBoundary(root,res);
        return res;
    }
    boolean isLeaf(Node node){
        return node.left==null && node.right==null;
    }
    void addLeftBoundary(Node root,ArrayList<Integer> res){
        Node cur=root.left;
        while(cur!=null){
            if(!isLeaf(cur)) res.add(cur.data);
            if(cur.left!=null){
                cur=cur.left;
            }else{
                cur=cur.right;
            }
        }
    }
    void addLeafNodes(Node root,ArrayList<Integer> res){
        if(isLeaf(root)){
            res.add(root.data);
            return;
        }
        if(root.left!=null) addLeafNodes(root.left,res);
        if(root.right!=null) addLeafNodes(root.right,res);
    }
    void addRightBoundary(Node root,ArrayList<Integer> res){
        Node cur=root.right;
        ArrayList<Integer> temp=new ArrayList<>();
        while(cur!=null){
            if(!isLeaf(cur)) temp.add(cur.data);
            if(cur.right!=null){
                cur=cur.right;
            }else{
                cur=cur.left;
            }
        }
        for(int i=temp.size()-1;i>=0;i--){
            res.add(temp.get(i));
        }
    }
}