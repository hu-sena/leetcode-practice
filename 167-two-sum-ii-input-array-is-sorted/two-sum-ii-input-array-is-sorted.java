class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // two sum problem: find the difference if exist
        // return = get the values (indices)

        // METHOD: sorted --> two pointers = O(N) memory space
        // while: sum of 2 numbers of start + end != target
        // if sum > target = end--
        // if sum < target = start++
        // return the indices since is sum == target when break while loop

        int start = 0;
        int end = numbers.length - 1;
        for (int i = 0; i < numbers.length; i++) {
            
            while (numbers[start] + numbers[end] != target) {
                if (numbers[start] + numbers[end] > target) {
                    end--;
                } else {
                    start++;
                }
            }
            
        }
        return new int[] {start+1, end+1};
    
    }
}