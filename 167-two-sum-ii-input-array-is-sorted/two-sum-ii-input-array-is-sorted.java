class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // two sum problem: find the difference if exist in hashmap
        // pair: difference (target - num[i]) and the num[i]

        // return = get the value (index)
        

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int difference = target - numbers[i];
            // if hashmap contains difference as key - take the value index: i of nums[i] + i of difference
            if (map.containsKey(difference)) {
                return new int[] {map.get(difference)+1, i+1};
            }
            map.put(numbers[i], i);
        }
        return null;
    }
}