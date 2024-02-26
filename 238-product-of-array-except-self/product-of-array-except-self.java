class Solution {
    public int[] productExceptSelf(int[] nums) {
        // multiply all elements except element[i]

        // using 2 passess: left + right
        
        // METHOD 1: prefix * postfix product = output - requires 3 storages
        // METHOD 2: start product * end product - store into either 

        // return array to store result
        int[] result = new int[nums.length];

        int[] prefix_products = new int[nums.length];
        int[] postfix_products = new int[nums.length];

        // METHOD 1: 
        prefix_products[0] = 1;

        // i = second place start
        for (int i = 1; i < nums.length; i++) {
            prefix_products[i] = nums[i - 1] * prefix_products[i - 1]; 
        }

        postfix_products[nums.length - 1] = 1;

        // i = second place end
        for (int i = nums.length - 2; i >= 0; i--) {
            postfix_products[i] = nums[i + 1] * postfix_products[i + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix_products[i] * postfix_products[i];
        }

        return result;

        
        /*
        int leftProduct = 1;
        for (int left = 0; left < nums.length; left++) {
            result[i] = leftProduct;
            leftProduct = leftProduct * nums[left];
        }

        int rightProduct = 1;
        for (int right = nums.length; right >= 0; right--) {
            result[right] = result[right] * rightProduct;
            rightProduct = rightProduct * nums[right];
        }
        */

        // count to keep track - pseudo array
    }
}