class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        if (n < 2) return nums;
        // Apply operations
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                // nums[i] = 2 * nums[i];
                nums[i] = nums[i] << 1;
                nums[i + 1] = 0;
            }
        }
        // Shift all 0's to the end
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        // Make the last section all 0's.
        for (int i = index; i < n; i++) {
            nums[index++] = 0;
        }

        return nums;
    }
}