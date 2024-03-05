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
        backtracking(brackets, "", 0, 0, n);
        return brackets;
    }

    public void backtracking(List<String> bracket, String str, int open, int close, int length) {
        // base case: when the amount of pair bracket is completed as in n == 2*n
        // reason: end result of open + close brackets totaled 2*n
        // add the combination to array list
        if (str.length() == 2*length) {
            bracket.add(str);
        }

        // recursive condition
        // 1. open < n: add open
        if (open < length) {
            backtracking (bracket, str + "(", open + 1, close, length);
        }
        // 2. open > close: add close
        if (open > close) {
            backtracking (bracket, str + ")", open, close + 1, length);
        }
    }
}