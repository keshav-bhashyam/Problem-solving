class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mIndex = m - 1, nIndex = n - 1, p = nums1.length - 1;

        while (p >= 0) {
            int c1 = (mIndex >= 0) ? nums1[mIndex] : Integer.MIN_VALUE;
            int c2 = (nIndex >= 0) ? nums2[nIndex] : Integer.MIN_VALUE;
            if (c1 >= c2) {
                nums1[p] = c1;
                mIndex--;
            } else {
                nums1[p] = c2;
                nIndex--;
            }
            p--;
        }
    }
}