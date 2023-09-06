class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int longestRun = 0, n = s.length();
        Set<Character> charSet = new HashSet<>();

        // if (n == 1 && k >= 1) return 1;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                charSet.add(s.charAt(j));
                 if (charSet.size() <= k) {
                    longestRun = Math.max(longestRun, j - i + 1);
                } else if (charSet.size() > k ) {
                    charSet.clear();
                    break;
                }
            }
        }
        return longestRun;
    }
}