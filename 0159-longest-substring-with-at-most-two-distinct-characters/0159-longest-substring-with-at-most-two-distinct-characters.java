class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int l = 0, r = 0, n = s.length(), longestRun = 0;
        Map<Character, Integer> counter = new HashMap<>();

        if (n < 3) return n;

        while ( r < n ) {
            counter.put(s.charAt(r), counter.getOrDefault(s.charAt(r), 0) + 1);

            if (counter.size() > 2) {
                counter.put(s.charAt(l), counter.getOrDefault(s.charAt(l), 0) - 1);
                if (counter.get(s.charAt(l)) == 0) {
                    counter.remove(s.charAt(l));
                }
                l++;
            }

            longestRun = Math.max(longestRun, r - l + 1);
            r++;
        }

        return longestRun;   
    }
}