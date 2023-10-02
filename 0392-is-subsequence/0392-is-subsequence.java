class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0, sLen = s.length(), tLen = t.length();
        while (i < sLen && j < tLen) {
            if (s.charAt(i) == t.charAt(j))
                i++;
            j++;
        }
        return i == sLen;
    }
}