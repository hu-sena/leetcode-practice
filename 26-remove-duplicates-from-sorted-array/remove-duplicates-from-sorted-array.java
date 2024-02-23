class Solution {
    public int removeDuplicates(int[] nums) {
        
        // order matters
        // learning: treeset (natural order), hashset (random order), linkedhasset (insertion order)

        
        // remove duplicate using linkedhasset: INVALID 
        // reason: set collections already remove duplicate - no way to retrieve duplicate index

        // find occurrences: hashmap: INVALID - random order
        // Map<Integer, Integer> numbers = new HashMap<>();

        // use array list
        List<Integer> numbers = new ArrayList<>();

        // to keep track the amount of unique element: at least 1 unique element
        int count = 1;
        
        // only 1 loop - working on the original array to replace with unique element
        for (int i = 1; i < nums.length; i++) {
            
            // when found duplicate - return the index: WRONG
            // reason: it is actually return the size of array after removing duplicate

            // pseudo new array - replacing original array with only unique element
            if (nums[i] != nums[i - 1]) {
                nums[count] = nums[i];
                count++;
                
            }
        
        }
        // return the next index after unique element
        return count;
    }
}