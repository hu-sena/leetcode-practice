class Solution {
    public int singleNumber(int[] nums) {
        // occurrences = hashmap
        // each element appear twice - using XOR to cancel out 2 elements = 0

        // sort array
        Arrays.sort(nums);

        // XOR for [i] + [i + 1] - iterate every 2i: INVALID - out of bound
        // XOR - no order of operation = cumulative XOR every element

        // initialize XOR as first element to avoid affecting result than 0: INVALID
        // reason: finding unique elements
        
        int XOR = 0;
        for (int i = 0; i < nums.length; i++) {
            XOR = XOR ^ nums[i];
        }

        return XOR;
        
    }
}