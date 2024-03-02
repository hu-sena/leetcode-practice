class Solution {
    public int maxArea(int[] height) {
        // same problem as longest sequence number - INVALID
        // using 2 pointers - EACH ITERATION need to calculate: height * width to find max

        // height = height[i] + width = larger pointer - smaller pointer
        // NOTE: the height should take the smaller pointer

        // a_pointer (start) + b_pointer (last)
        // as long as start > last
        // if: height: a_pointer > b_pointer = height[b_pointer] * (b_pointer - a_pointer)
        // else: height[a_pointer] * (b_pointer - a_pointer)
        // keep track both pointers: +/- of pointer which smaller
        // check maximum by max or current_max


        int a_pointer = 0;
        int b_pointer = height.length - 1;
        int max = 0;

        while (a_pointer < b_pointer) {
            if (height[a_pointer] < height[b_pointer]) {
                max = Math.max(max, height[a_pointer] * (b_pointer - a_pointer));
                a_pointer++;
            } else {
                max = Math.max(max, height[b_pointer] * (b_pointer - a_pointer));
                b_pointer--;
            }
        }

        return max;

    
    }
} 