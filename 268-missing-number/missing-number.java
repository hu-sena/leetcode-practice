class Solution {
    public int missingNumber(int[] nums) {
        // sort array
        Arrays.sort(nums);

        // using permutation formula: (N * (N + 1)) / 2
        // find expected sum given from N

        int N = nums.length;
        // elements start with 0
        int expected_sum = (N * (N + 1)) / 2;
        int sum = 0;

        // sum all elements from original array - iteration
        for (int i = 0; i < N; i++) {
            sum = sum + nums[i];
        }

        // missing num = expected sum - sum
        int missing_num = expected_sum - sum;

        return missing_num;

    }
}