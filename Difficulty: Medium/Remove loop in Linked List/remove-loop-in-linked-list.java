/*
class Node
{
    int data;
    Node next;
}
*/

class Solution {
    public static void removeLoop(Node head) {
        // code here
        if(head==null) return;
        Set<Node> set=new HashSet<>();
        Node temp=head;
        Node pre=null;
        while(temp!=null){
            if(set.contains(temp)){
                pre.next=null;
                return;
            }
            set.add(temp);
            pre=temp;
            temp=temp.next;
        }
    }
}