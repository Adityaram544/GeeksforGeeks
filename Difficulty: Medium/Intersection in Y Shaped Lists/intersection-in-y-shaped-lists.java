/*
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
    public Node intersectPoint(Node head1, Node head2) {
        // code here
        Node slow=head1;
        Node fast=head2;
        while(slow!=fast){
            if(slow==null) slow=head2;
            if(fast==null) fast=head1;
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}