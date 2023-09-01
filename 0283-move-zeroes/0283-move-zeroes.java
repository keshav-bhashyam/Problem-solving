class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        if (n == 1) return;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == 0) {
                // Find first non-zero element and replace i with j
                int j = i + 1;
                while ((j < n) && (nums[j] == 0)) j++;
                if (j >= n) break;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
    }
}