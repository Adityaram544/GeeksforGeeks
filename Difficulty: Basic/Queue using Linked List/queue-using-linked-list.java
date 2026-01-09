// Node class
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

// Queue class
class myQueue {
    private Node front;
    private Node rear;
    private int count;
    public myQueue() {
        // Initialize your data members
        front=null;
        rear=null;
        count=0;
    }

    public boolean isEmpty() {
        // check if the queue is empty
        return count==0;
    }

    public void enqueue(int x) {
        // Adds an element x at the rear of the queue.
        Node temp=new Node(x);
        if(isEmpty()){
            front=temp;
            rear=temp;
        }else{
            rear.next=temp;
            rear=temp;
        }
        count++;
    }

    public void dequeue() {
        // Removes the front element of the queue
        if(isEmpty()) return;
        front=front.next;
        count--;
        if(front==null) rear=null;
    }

    public int getFront() {
        // Returns the front element of the queue.
        // If queue is empty, return -1.
        return isEmpty() ? -1 : front.data;
    }

    public int size() {
        // Returns the current size of the queue.
        return count;
    }
}
