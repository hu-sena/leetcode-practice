class Solution {
    public String longestCommonPrefix(String[] strs) {
        // compare all the characters in each element, then find the longest prefix
        
        // METHOD:
        // sort the array as in only compare the first and the last == characters that are the same for both
        Arrays.sort(strs);
        String firstString = strs[0];
        String lastString = strs[strs.length - 1];

        // comparing by each index
        // CAUTION: must check both strings not exceed character length
        // if-else is not a loop
        int index = 0;
        while (index < firstString.length() && index < lastString.length()) {
            if (firstString.charAt(index) == lastString.charAt(index)) {
                index++;
            } else {
                // to avoid TLE: it will keep looping so we check only when index == index
                // problem when the string is looooong
                break;
            }
        }

        // return as substring from 0 to index
        return firstString.substring(0, index);
    }
}