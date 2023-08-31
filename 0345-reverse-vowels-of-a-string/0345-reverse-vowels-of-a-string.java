class Solution {
    
    static String vowels = "aeiouAEIOU";

    public String reverseVowels(String s) {
        int l = 0;
        int r = s.length() - 1;
        char[] ca = s.toCharArray();

        while (l < r) {
            while (!vowels.contains(String.valueOf(ca[l])) && l < r) {
                l++;
            }
            while (!vowels.contains(String.valueOf(ca[r])) && l < r) {
                r--;
            }
            if (l < r) {
                char t = ca[l];
                ca[l] = ca[r];
                ca[r] = t;
                l++;
                r--;
            }
        }
        return new String(ca);
    }
}