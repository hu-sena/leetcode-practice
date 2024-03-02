class MinStack {

    // stack: LIFO - last in first out

    // declare variable outside of constructor so it can be used by other methods
    // create another stack to keep track of min values
    Stack<Integer> stack;
    Stack<Integer> minStack;

    // need to keep track of min element when push, pop, peek

    public MinStack() {
        // make the variable as instantiated inside constructor
        this.stack = new Stack<>();
        this.minStack = new Stack<>();
        
    }
    
    public void push(int val) {
        // push into min stack if current top min value => current value
        stack.push(val);
        if (minStack.isEmpty() || minStack.peek() >= val) {
            minStack.push(val);
        }
    }
    
    public void pop() {
        // if top current value to be removed is the same as current top min value
        
        // using equals() instead of == 
        // REASON: to compare the actual content not the memory address
        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        stack.pop();
    }
    
    public int top() {
        // using peek() to find the top element (value)
        return stack.peek();
    }
    
    public int getMin() {

        // cannot use for loop = O(N)

        // return the current top element of min stack
        return minStack.peek();
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