class myQueue {

    // Initialize your data members
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();

    void enqueue(int x) {
        // Implement enqueue operation
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.add(x);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    void dequeue() {
        // Implement dequeue operation
        if(s1.isEmpty()) return;
        s1.pop();
    }

    int front() {
        // Implement front operation
        return s1.isEmpty() ? -1 : s1.peek();
    }

    int size() {
        // Implement size operation
        return s1.size();
    }
}
