class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] words = s.trim().split("\\s+");

        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i]!= " ")
                result.append(words[i]).append(" ");
        }
        return result.deleteCharAt(result.length() - 1).toString();
    }
}