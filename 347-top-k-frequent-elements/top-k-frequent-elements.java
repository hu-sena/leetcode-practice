class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // top K elements: if it want top 3 elements then give top 3 elements most frequencies
        // count occurrences: hashmap

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);

        }

        // descending order
        // using priority queue to sort the value from hashmap using entry set
        // ALTERNATIVE: add key only so no need entry set
        // remove: poll method to get top elements
        Queue<Integer> queue = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        for (int key : map.keySet()) {
            queue.add(key);
        }

        // using entry set to access the hashmap - insert into queue

        // INVALID: List<Integer> result = new ArrayList<>();
        // return type need to in array

        int[] result = new int[k];

        // remove element only top k - store into array list
        for (int i = 0; i < k; i++) {
            result[i] = queue.poll();
        }

        return result;
        
    }
}