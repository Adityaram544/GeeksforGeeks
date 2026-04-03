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
    public ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        helper(root,res,0);
        return res;
    }
    private void helper(Node node,ArrayList<Integer> res,int level){
        if(node==null) return;
        if(level==res.size()){
            res.add(node.data);
        }
        helper(node.left,res,level+1);
        helper(node.right,res,level+1);
    }
}