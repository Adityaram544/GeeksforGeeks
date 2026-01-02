/*Node class  used in the program
class Node
{
    int data;
    Node next;
    Node bottom;

    Node(int d)
    {
        data = d;
        next = null;
        bottom = null;
    }
}
*/
/*  Function which returns the  root of
    the flattened linked list. */
class GfG {
    Node flatten(Node root) {
        // Your code here
        if(root==null || root.next==null) return root;
        Node mergeHead=flatten(root.next);
        return merge(root,mergeHead);
    }
    private static Node merge(Node l1,Node l2){
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
        if(l1!=null){
            temp.bottom=l1;
        }
        if(l2!=null){
            temp.bottom=l2;
        }
        if(dummy.bottom!=null) dummy.bottom.next=null;
        return dummy.bottom;
    }
}