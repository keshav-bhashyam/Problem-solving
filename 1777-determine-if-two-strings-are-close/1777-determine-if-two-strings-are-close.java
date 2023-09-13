class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        Map<Character, Integer> word1Map = new HashMap<>();
        Map<Character, Integer> word2Map = new HashMap<>();
        for (char c : word1.toCharArray()) {
            word1Map.put(c, word1Map.getOrDefault(c, 0) + 1);
        }
        for (char c : word2.toCharArray()) {
            if (!word1Map.containsKey(c)) {
                return false;
            }
            word2Map.put(c, word2Map.getOrDefault(c, 0) + 1);
        }

        List<Integer> values1 = new ArrayList<>(word1Map.values());
        List<Integer> values2 = new ArrayList<>(word2Map.values());
        Collections.sort(values1);
        Collections.sort(values2);

        return values1.equals(values2);
    }
}