class Solution {
    public List<String> generateParenthesis(int n) {
        // print all possible combinations of bracket - complete pair
        // using backtracking method: permutations - need contraints, base case == DFS

        // BASE CASE: n == 0
        // CONSTRAINT: open bracket > close bracket
        // reason: close bracket is only valid if there is open bracket

        // bracktracking as helper class

        List<String> brackets = new ArrayList<>();

        // pass: the array list to add bracket string + string builder + open + close + n
        
        // METHOD: using n as max length then delete based on condition when backtracking
        backtracking(brackets, new StringBuilder(), n, n);
        return brackets;
    }

    public void backtracking(List<String> bracket, final StringBuilder str, int open, int close) {
        // base case: when the amount of pair bracket is completed as in n == 2*n
        // reason: end result of open + close brackets totaled 2*n
        // add the combination to array list
        if (open == 0 && close == 0) {
            bracket.add(str.toString());
        }

        // each recursive call - delete the latest parenthesis to explore different path

        // recursive condition
        // 1. when open > 0: append "("
        if (open > 0) {
            str.append("(");
            backtracking (bracket, str, open - 1, close);
            str.deleteCharAt(str.length() - 1);
        }
        // 2. open < close: append ")"
        if (open < close) {
            str.append(")");
            backtracking (bracket, str, open, close - 1);
            str.deleteCharAt(str.length() - 1);
        }
    }
}