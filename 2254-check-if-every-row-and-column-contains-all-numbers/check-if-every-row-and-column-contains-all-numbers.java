class Solution {
    public boolean checkValid(int[][] matrix) {
        // using hashset to avoid duplicate
        // iterate through row + column

        Set<Integer> numbers = new HashSet<>();

        // check each row + column has unique number
        for (int row = 0; row < matrix.length; row++) {
            // reset hashset when enter new row
            numbers.clear();
            for (int column = 0; column < matrix.length; column++) {
                if (numbers.contains(matrix[row][column])) {
                    return false;
                }
                numbers.add(matrix[row][column]);
            }
            
        }

        for (int row = 0; row < matrix.length; row++) {
            // reset hashset when enter new row
            numbers.clear();
            for (int column = 0; column < matrix.length; column++) {
                if (numbers.contains(matrix[column][row])) {
                    return false;
                }
                numbers.add(matrix[column][row]);
            }
            
            
        }

        return true;
    }
}