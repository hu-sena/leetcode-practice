class Solution {
    public int singleNumber(int[] nums) {
        // occurrences = hashmap

        Map<Integer, Integer> map = new HashMap<>();

        // insert all nums into hashmap
        // count occurrences using getOrDefault
        // REMINDER: get() method in hashmap to get value
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // search among the value which one have only 1 occurrence
        // using entrySet() method
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return 0;
        
    }
}