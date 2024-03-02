class Solution {

    int end;
    String[] tokens;
    public int evalRPN(String[] tokens) {
        // APPROACH:
        // NOTE: check first if it is operands (nums) or operators
        // add the operands into the stack
        // do the operation on latest 2 operands when found the operators
        // pop the operands - then push the result into the stack

        // METHOD: using recursive
        // no need to use stack
        // start the iteration at the end of array - then continue to decrement in the recursive method
        // recursively call the method: to check the operands - SPEACIAL CASE: divide + minus
        // 
        // need to use this.tokens to keep track of current token

        end = tokens.length - 1;
        this.tokens = tokens;
        return calculate();

    }

    public int calculate() {

        return switch (tokens[end--]) {

            // using lambda expression: executed first then returned
            case "+" -> calculate() + calculate();
            case "-" -> minus(calculate(), calculate());
            case "*" -> calculate() * calculate();
            case "/" -> divide(calculate(), calculate());

            // using parseInt to ensure it is valid string integer to primitive int
            default -> Integer.parseInt(tokens[end+1]);
        };

    }

    public static int minus (int second, int first) {
        return first - second;
    }

    public static int divide (int second, int first) {
        return first / second;
    }
}