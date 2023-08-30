class Solution {
    public String mergeAlternately(String word1, String word2) {
        int s1Counter = 0;
        int s2Counter = 0;
        boolean order = true;

        StringBuilder sb = new StringBuilder();

        while (s1Counter < word1.length() && s2Counter < word2.length()) {
            sb.append(word1.charAt(s1Counter++));
            sb.append(word2.charAt(s2Counter++));
        }

        if (s1Counter < word1.length()) sb.append(word1.substring(s1Counter));
        if (s2Counter < word2.length()) sb.append(word2.substring(s2Counter));

        return sb.toString();
    }
}