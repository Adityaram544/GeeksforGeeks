/* Structure of linked list node
class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/
class Solution {
    Node compute(Node head) {
        // code here
        head=reverse(head);
        Node temp=head;
        while(temp.next!=null){
            if(temp.data>temp.next.data){
                temp.next=temp.next.next;
            }else{
                temp=temp.next;
            }
        }
        head=reverse(head);
        return head;
    }
    Node reverse(Node head){
        Node cur=head;
        Node pre=null;
        while(cur!=null){
            Node next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return pre;
    }
    
}