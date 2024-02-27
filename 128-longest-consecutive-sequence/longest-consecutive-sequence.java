class Solution {
    public int longestConsecutive(int[] nums) {

        // brute force: for loop until it breaks - TLE

        // using hashset to avoid duplicate (only include distinct number - duplicate ignore)
        // keep track of count of consecutive elements

        // find start(min) + end(max) points - update when found
        // UPDATE: only find start is enough so: end = start + 1, start + 2,,,

        Set<Integer> numbers = new HashSet<>();

        // to find max sequence of count
        int max = 0;

        for (int num : nums) {
            // hashset: ignore duplicate
            numbers.add(num);
        }

        // METHOD: neetcode
        // iterate each element
        // check if num[i] - 1 does not exist in hashset
        // continue to add + 1 to num[i] if the result exist in nums - keep track
        // find the max of count


        // using hashset to iterate through distinct num
        for (int num : numbers) {
            // start 1 - at least there is 1 sequence of num
            int count = 1;

            if (!numbers.contains(num - 1)) {
                // this is to keep adding the current num + 1 - stop when not found
                int currentNum = num;
                while (numbers.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }
            }

            max = Math.max(max, count);
        }

        return max;
    }
}