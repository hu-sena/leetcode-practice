class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // sum of all possible of 3 numbers in array is 0

        // BOTH NEED TO BE SORTED
        // two sum = 2 pointers: check start + end == target
        // three sum = 3 pointers: check left + right of current num
        

        // no duplicate from the combinations = hashset

        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            int left = i+1;
            int right = nums.length - 1;
            // edge case: when nums[i] == nums.length - index out of bounds = check as long as left < right
            
            // NOTE: inner loop can cause TLE if long iterations to find the right combination
            // therefore: find the first combination 


            while (left < right) {
                if (nums[i] + nums[right] + nums[left] == 0) {
                    set.add(Arrays.asList(nums[i], nums[right], nums[left]));
                    // skip duplicate
                    right--;
                    left++;
                    
                } else if (nums[i] + nums[right] + nums[left] > 0) {
                    right--;
                } else {
                    left++;
                }
            
            }
            
        
            
        }
        result.addAll(set);
        return result;
    }
}