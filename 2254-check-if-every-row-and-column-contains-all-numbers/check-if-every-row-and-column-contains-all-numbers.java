class Solution {
    public boolean checkValid(int[][] matrix) {
        // using hashset to avoid duplicate
        // iterate through row + column

        Set<Integer> numbers = new HashSet<>();

        // check each row + column has unique number
        for (int row = 0; row < matrix.length; row++) {
            numbers.clear();
            for (int column = 0; column < matrix.length; column++) {
                if (numbers.contains(matrix[row][column])) {
                    return false;
                }

                numbers.add(matrix[row][column]);
            }
            
            
        }

        for (int row = 0; row < matrix.length; row++) {
            numbers.clear();
            for (int column = 0; column < matrix.length; column++) {
                if (numbers.contains(matrix[row][column])) {
                    return false;
                }

                numbers.add(matrix[row][column]);
            }
            
            
        }

        for (int column = 0; column < matrix.length; column++) {
            numbers.clear();
            for (int row = 0; row < matrix.length; row++) {
                if (numbers.contains(matrix[row][column])) {
                    return false;
                }

                numbers.add(matrix[row][column]);
            }
            
            
        }



        return true;
    }
}