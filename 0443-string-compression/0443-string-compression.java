class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        if (n == 1) return n;

        int l = 0, count = 1, charsIndex = 0;
        char[] temp = new char[n];

        while (l < n) {
            for (int i = l + 1; i < n; i++) {
                if (chars[i - 1] == chars[i]) {
                    count++;
                } else {
                    break;
                }
            }
            temp[charsIndex++] = chars[l];
            if (count > 1) {
                char[] t = Integer.toString(count).toCharArray();
                for (int i = 0; i < t.length; i++) {
                    temp[charsIndex++] = t[i];
                }
            }

            l = l + count;
            count = 1;
        }

        for (int i = 0; i < charsIndex; i++) {
            chars[i] = temp[i];
        }

        return charsIndex;
    }
}