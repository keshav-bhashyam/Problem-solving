class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] charCounter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            charCounter[s.charAt(i) - 'a']++;
            charCounter[t.charAt(i) - 'a']--;
        }
        
        for (int count : charCounter) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}