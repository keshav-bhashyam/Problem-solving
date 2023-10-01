class Solution {
    public String reverseWords(String s) {
        String[] s1 = s.trim().split("\\s+");
        if (s1.length == 1) return s1[0];

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s1.length / 2; i++) {
            String temp = s1[i];
            s1[i] = s1[s1.length - i - 1];
            s1[s1.length - i - 1] = temp;
        }
        for (int i = 0; i < s1.length; i++) {
            sb.append(s1[i]).append(" ");
        }

        return sb.deleteCharAt(sb.length() - 1).toString();
    }
}