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
    public Node addTwoLists(Node head1, Node head2) {
        // code here
        head1=removeLeadZero(head1);
        head2=removeLeadZero(head2);
        head1=reverse(head1);
        head2=reverse(head2);
        Node dummy=new Node(-1);
        Node temp=dummy;
        int carry=0;
        while(head1!=null || head2!=null || carry!=0){
            int sum=carry;
            if(head1!=null){
                sum+=head1.data;
                head1=head1.next;
            }
            if(head2!=null){
                sum+=head2.data;
                head2=head2.next;
            }
            carry=sum/10;
            temp.next=new Node(sum%10);
            temp=temp.next;
        }
        return reverse(dummy.next);
    }
    
    private static Node reverse(Node head){
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            Node front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
    
    private static Node removeLeadZero(Node head){
        while(head!=null && head.data==0){
            head=head.next;
        }
        return head==null ? new Node(0) : head;
    }
}