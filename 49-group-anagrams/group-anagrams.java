class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // sorting: characters + hashmap

        Map<String, List<String>> map = new HashMap<>();

        // group by checking if it's anagram of the current str]
        for (String str : strs) {
            // each string of strs: sort
            char[] sortedWord = str.toCharArray();
            Arrays.sort(sortedWord);
            String word = new String(sortedWord);
            
            // if: key not exist in hashmap - create key (sorted word) + value
            if (!map.containsKey(word)) {
                map.put(word, new ArrayList<>());
            }

            // key exist - add the value into existing key
            map.get(word).add(str);
            

            // COMPARE SORTED WORDS WITH SORTED KEY: invalid
        }
        return new ArrayList<>(map.values());
    }

}