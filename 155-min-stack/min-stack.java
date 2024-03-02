class MinStack {

    // stack: LIFO - last in first out

    // declare variable outside of constructor so it can be used by other methods
    // create another stack to keep track of min values
    
    // METHOD: using linked list to keep track min value

    // declare a variable to keep track of the head of Node
    private Node head;

    // create Node class: store data (value + min value), Node next
    public class Node {
        int val;
        int min;
        Node next;

        private Node (int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }

    }

    public MinStack() {

    }

    public void push(int val) {
        // push into the Node as assign the latest Node as head
        if (head == null) {
            // no head.next yet
            head = new Node (val, val, null);
        } else {
            // head.next is as the current head before assign to new head 
            head = new Node (val, Math.min(val, head.min), head);
        }
    }

    public void pop() {
        // transfer new head to head.next
        head = head.next;

    }

    public int top() {
        // val of current head
        return head.val;
    }

    public int getMin() {
        return head.min;

    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */