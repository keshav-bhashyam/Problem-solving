class Solution {
    private char[] reverse(String ss) {
        char[] s = ss.toCharArray();
        for (int i = 0; i < s.length/2; i++) {
            char c = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = c;
        }
        return s;
    }

    public String reverseWords(String s) {
        int n = s.length();
        if (n == 1) return s;
        StringBuilder reversed = new StringBuilder();

        String[] sArray = s.split(" ");
        for (int i = 0; i < sArray.length; i++) {
            reversed.append(reverse(sArray[i]));
            if (i != sArray.length - 1) reversed.append(' ');
        }
        return reversed.toString();
    }
}