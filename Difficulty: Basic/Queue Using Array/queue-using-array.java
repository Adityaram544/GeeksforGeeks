class myQueue {
    private int queueArray[];
    private int front,rear,size,count;
    // Constructor
    public myQueue(int n) {
        // Define Data Structures
        queueArray=new int[n];
        size=n;
        count=0;
        front=0;
        rear=-1;
    }

    public boolean isEmpty() {
        // Check if queue is empty
        return count==0;
    }

    public boolean isFull() {
        // Check if queue is full
        return count==size;
    }

    public void enqueue(int x) {
        // Enqueue
        if(isFull()) return;
        rear=(rear+1)%size;
        queueArray[rear]=x;
        count++;
    }

    public void dequeue() {
        // Dequeue
        if(isEmpty()) return;
        front=(front+1)%size;
        count--;
    }

    public int getFront() {
        // Get front element
        if(isEmpty()) return -1;
        return queueArray[front];
    }

    public int getRear() {
        // Get last element
        if(isEmpty()) return -1;
        return queueArray[rear];
    }
}
