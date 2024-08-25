class Solution {
    public int lengthOfLastWord(String s) {
        // insert all the strings into list -- trim
        // count the length of the last item

        // List<String> list = new ArrayList<>();
        // for (String word : s.trim().split(" ")) {
        //     list.add(word);
        // }
        // int characters = list.get(list.size() - 1).length();

        // return characters;

        // NEW METHOD:
        // iterate through all the strings
        // for each string: count each characters -- if " " break, else not " " count++

        int count = 0;
        // .length() = count elements
        for (int i = s.length() - 1; i >= 0; i--) {
            // count > 0: in case of the last item in string is space - stop counting
            // ex: "world " - only break when it starts counting 
            if (count > 0 && s.charAt(i) == ' ')
            break;
            if (s.charAt(i) != ' ')
            count++;
        }

        return count;
    }
}