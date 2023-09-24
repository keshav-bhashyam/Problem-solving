class Solution {
    private static int EMPTY_VAL = -200;
    public int removeDuplicates(int[] nums) {
        int l = 1, r = nums.length, k = nums.length;

        while (l < r) {
            if (nums[l] == nums[l - 1] && nums[l] != EMPTY_VAL) {
                for (int i = l; i < r - 1; i++) {
                    nums[i] = nums[i + 1];
                }
                nums[--k] = EMPTY_VAL;
            } else {
                l++;
            }
        }
        return k;
    }
}