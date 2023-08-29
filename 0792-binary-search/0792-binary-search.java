class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1, m = 0;

        while (l <= r) {
            m = l + (r - l) / 2;

            if (nums[m] == target) {
                return m;
            } else if (nums[m] < target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return -1;
    }
}