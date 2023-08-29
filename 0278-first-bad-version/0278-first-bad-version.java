/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if (n == 1) return n;

        int l = 1, r = n, m = 0;

        while (l < r) {
            m = l + (r - l) / 2;
            boolean bv = isBadVersion(m);
            if (bv == true) {
                r = m;
            } else {
                l = m + 1;
            }
        }

        return l;
    }
}