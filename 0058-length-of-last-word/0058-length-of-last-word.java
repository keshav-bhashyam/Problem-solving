class Solution {
    public int lengthOfLastWord(String s) {
        String[] ss = s.split(" ");
        return s.split(" ")[ss.length - 1].length();
    }
}