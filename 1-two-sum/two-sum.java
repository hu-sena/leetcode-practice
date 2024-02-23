class Solution {
    public int[] twoSum(int[] nums, int target) {
        // nums[i] + nums[i + 1] = array out of bound

        // if using HashMap: minus target to each elements - check if the value exist in the map
        // cannot with the same num
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            // when found same num in the hashmap = 
            int diff = target - nums[i];

            // if hashmap contains diff as element (key)
            if (map.containsKey(diff)) {

                // return index of current element (key)
                // HOW CAN IT SKIP SAME ELEMENT AS DIFFERENCE
                return new int[] {map.get(diff), i};
            }

            // update the hashmap by putting element (key) + index (value)
            map.put(nums[i], i);
        }

        return null;

    }
}