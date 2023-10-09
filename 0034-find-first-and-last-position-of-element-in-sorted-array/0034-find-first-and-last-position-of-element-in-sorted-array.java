class Solution {

    private int findRightIndex(int[] nums, int target) {
        int r = nums.length - 1, l = 0, m = 0;

        while (l <= r) {
            m = l + (r - l)/2;
            if (nums[m] == target) {
                if ((m == nums.length - 1) || nums[m + 1] != nums[m]) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (target < nums[m]) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    private int findLeftIndex(int[] nums, int target) {
        int r = nums.length - 1, l = 0, m = 0;

        while (l <= r) {
            m = l + (r - l)/2;
            if (nums[m] == target) {
                if (m == 0 || (nums[m - 1] != nums[m])) {
                    return m;
                } else {
                    r = m - 1;
                }
            } else if (target < nums[m]) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) return new int[]{-1, -1};
        int leftIndex = findLeftIndex(nums, target);
        int rightIndex = findRightIndex(nums, target);
        return new int[]{leftIndex, rightIndex};
    }
}