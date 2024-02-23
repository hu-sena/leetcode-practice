class Solution {
    public int countSubstrings(String s) {
        // create substring that is palindrome (include 1 letter)

        // create all possible substring
        // check if it is palindrome

        List<String> substrings = new ArrayList<>();

        // outer loop + inner loop
        for (int beginIndex = 0; beginIndex < s.length(); beginIndex++) {
            // must be inclusive - till last character
            for (int lastIndex = beginIndex + 1; lastIndex <= s.length(); lastIndex++) {
                String sub = s.substring(beginIndex, lastIndex);
                substrings.add(sub);
            }
        }

        // insert into array list - return the size

        List<String> palindromeSubstrings = new ArrayList<>();

        for (String substring : substrings) {
            if (isPalindrome(substring)) {
                palindromeSubstrings.add(substring);
            }
        }

        return palindromeSubstrings.size();
    }

    // palindrome: lastChar == firstChar
    // using helper method to check each substring if palindrome

    public boolean isPalindrome(String s) {

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}