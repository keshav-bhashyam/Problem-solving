class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length, count = 1, totalCount = 1;

        if (n == 1) return 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1] & count < 2) {
                nums[totalCount++] = nums[i];
                count++;
            } else if (nums[i] == nums[i - 1] & count == 2) {
                continue;
            } else if (nums[i] != nums[i - 1]) {
                nums[totalCount++] = nums[i];
                count = 1;
            }
        }
        return totalCount;
    }
}