class Solution {
    public String reverseWords(String s) {
        String[] s1 = s.trim().split("\\s+");
        if (s1.length == 1) return s1[0];
        
        StringBuilder sb = new StringBuilder();

        for (int i = s1.length - 1; i >= 0; i--) {
            sb.append(s1[i]).append(" ");
        }

        return sb.deleteCharAt(sb.length() - 1).toString();
    }
}