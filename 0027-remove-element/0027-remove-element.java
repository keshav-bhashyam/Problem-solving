class Solution {
    public int removeElement(int[] nums, int val) {
        int lastIndex = nums.length - 1;
        int c = 0, l = 0, r = nums.length - 1;

        while (l <= r) {
            if (nums[l] == val) {
                nums[l] = nums[lastIndex];
                nums[lastIndex] = -1;
                lastIndex--;
            } else {
                l++;
            }
        }

        for (int i = 0; i <= r; i++) {
            if (nums[i] != val && nums[i] != -1) c++;
        }
        return c;
    }
}