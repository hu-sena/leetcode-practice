class Solution {
    public int removeElement(int[] nums, int val) {
        // remove all occurrences of val
        // iterate through the array - then found element: remove
        // return num of elements after removing all val occurrences

        // using array list to store result with removed val: INVALID
        // reason: it should be modify to original array

        int resultIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                // replace original array by copying to original array
                nums[resultIndex] = nums[i];

                // to keep track count of how many elements inserted
                resultIndex++;
                
            }
        }

        // index of latest that do not have val = count
        return resultIndex;
    }
}