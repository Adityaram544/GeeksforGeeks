/*
class Node {
    int data;
    Node next;
    Node bottom;

    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}
*/
class Solution {
    public Node flatten(Node root) {
        // code here
        if(root==null || root.next==null) return root;
        Node mergeHead=flatten(root.next);
        return merge(root,mergeHead);
    }
    private Node merge(Node l1,Node l2){
        Node dummy=new Node(-1);
        Node temp=dummy;
        while(l1!=null && l2!=null){
            if(l1.data<l2.data){
                temp.bottom=l1;
                temp=l1;
                l1=l1.bottom;
            }else{
                temp.bottom=l2;
                temp=l2;
                l2=l2.bottom;
            }
            temp.next=null;
        }
        if(l1!=null) temp.bottom=l1;
        if(l2!=null) temp.bottom=l2;
        return dummy.bottom;
    }
}