class Solution {
    public int[] productExceptSelf(int[] nums) {
        // multiply all elements except element[i]

        // using 2 passess: left + right
        
        // METHOD 1: prefix * postfix product = output - requires 3 storages
        // METHOD 2: start product * end product - store into either 

        // return array to store result
        int[] result = new int[nums.length];

        // METHOD 2: 
        // same method but temp as either right or left
        int leftProduct = 1;
        for (int left = 0; left < nums.length; left++) {
            result[left] = leftProduct;
            leftProduct = leftProduct * nums[left];
        }

        int rightProduct = 1;
        for (int right = nums.length - 1; right >= 0; right--) {
            // result[right] in result[right] * rightProduct - hold values from result[left]
            result[right] = result[right] * rightProduct;
            rightProduct = rightProduct * nums[right];
        }

        // count to keep track - pseudo array
        return result;
    }
}