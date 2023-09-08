class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int l = 0, r = 0, longestRun = 0, n = s.length();
        Map<Character, Integer> charMap = new HashMap<>();

        if (k == 0) return 0;

        while (r < n) {
            charMap.put(s.charAt(r), charMap.getOrDefault(s.charAt(r), 0) + 1);

            if (charMap.size() > k) {
                charMap.put(s.charAt(l), charMap.get(s.charAt(l)) - 1);
                if ( charMap.get(s.charAt(l)) == 0 ) {
                    charMap.remove(s.charAt(l));
                }
                l++;
            }

            longestRun = Math.max(longestRun, r - l + 1);
            r++;
        }

        return longestRun;
    }
}