class Solution {
    public boolean check(int[] nums) {
        // obscure shift: search the substring - reason: it is still the same linear characters

        // idt it is appropriate using concatenate 
        // trial: calculate how many x shift
        // hint: brute force - check if it is possible for sorted array to start at each index
        // using count occurrences - if occurrence > 1: false
        // reason: in sorted array there is only 1 occurrence when nums[i] > nums[i + 1]

        // FIRST & FOREMOST: check first element > last element
        // 1. find the smallest element = i
        // 2. check if the num[i - 1] > n[i] = rotated array
        // 3. find shifts of element: (i + 1) % N

        // first element + last element is connected
        int count = 0;
            
            for (int i = 0; i < nums.length; i++) {
                // % - to keep it within bound
                int nextIndex = (i + 1) % nums.length;

                if (nums[i] > nums[nextIndex]) {
                    count++;
                
                }
            }

            if (count > 1) {
                return false;
            } else {
                return true;
            }



        // return true or false
    }
}