class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0, leftSum = 0, n = nums.length;

        for (int num : nums) totalSum += num;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == (totalSum - nums[i] - leftSum)) return i;
            leftSum += nums[i];
        }
        return -1;
    }
}