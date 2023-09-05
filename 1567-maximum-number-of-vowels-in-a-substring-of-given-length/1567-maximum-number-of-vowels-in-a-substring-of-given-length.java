class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int n = s.length();
        int maxLength = 0, currentLength = 0;

        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) currentLength++;
        }
        maxLength = Math.max(maxLength, currentLength);

        int l = 1, r = k;
        while (r < n) {
            if (vowels.contains(s.charAt(l - 1))) currentLength--;
            if (vowels.contains(s.charAt(r))) currentLength++;
            maxLength = Math.max(maxLength, currentLength);
            l++;
            r++;
        }
        return maxLength;
    }
}