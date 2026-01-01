/*
class Node{
    int data;
    Node next, prev;
    Node(int x){
        this.data = x;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    Node removeDuplicates(Node head) {
        // Code Here.
        Node temp=head;
        while(temp!=null){
            Node front=temp.next;
            while(front!=null && temp.data==front.data){
                front=front.next;
            }
            temp.next=front;
            if(front!=null){
                front.prev=temp;
            }
            temp=temp.next; 
        }
        return head;
    }
}