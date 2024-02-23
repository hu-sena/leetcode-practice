class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // merge array 
        // add second array to first array from (m - n) element

        // out loop: first array
        // inner loop: second array + initialize: last element of first array + 1
        // replace element of first array to second array

    
        // NO NEED 2 LOOPS

        // initialize all length

        // totalLen as preudo array to keep track of new array
        int totalLen = m + n - 1;

        int num_2Len = n - 1; int num_1Len = m  - 1;

        // iterate simultaneously - in reverse
        // sorting the array while inserting second array
        for (int i = totalLen; i >= 0; i--) {

            // check if both arrays not out of bound when decrementing 
            if (num_1Len >= 0 && num_2Len >= 0) {

                if (nums1[num_1Len] > nums2[num_2Len]) {
                    nums1[i] = nums1[num_1Len--];
                } else {
                    nums1[i] = nums2[num_2Len--];
                }

            // if there is remaining num in second array
            } else if (num_2Len >= 0) {
                nums1[i] = nums2[num_2Len--];

            }
            
        }

        // second array already merged to first array - use sort method: INVALID
        
    }
}