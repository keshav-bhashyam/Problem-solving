class Solution {
    public int lengthOfLastWord(String s) {
        int p = s.length() - 1, count = 0;

        while (p >= 0) {
            if (s.charAt(p) != ' ') {
                count++;
            } else if (count > 0) {
                return count;
            }
            p--;
        }
        return count;
    }
}