class Solution {
    public int evalRPN(String[] tokens) {
        // APPROACH:
        // NOTE: check first if it is operands (nums) or operators
        // add the operands into the stack
        // do the operation on latest 2 operands when found the operators
        // pop the operands - then push the result into the stack

        Stack<Integer> stack = new Stack<>();

        int first_operand;
        int second_operand;

        // using string first then convert to integer when push into stack
        // REASON: operators is not integer
        for (String token : tokens) {
            
            // NOTE: careful on the ordering for '-' & '/' --> second operand should pop first then first operand
            if (token.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (token.equals("-")) {
                second_operand = stack.pop();
                first_operand = stack.pop(); 
                stack.push(first_operand - second_operand);
            } else if (token.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (token.equals("/")) {
                second_operand = stack.pop();
                first_operand = stack.pop(); 
                stack.push(first_operand / second_operand);
            } else {
                // if not operators - push operands into stack by converting string to integer
                stack.push(Integer.parseInt(token));
            }

        }

        // return the last item as there is only 1 item left
        return stack.pop();


    }
}