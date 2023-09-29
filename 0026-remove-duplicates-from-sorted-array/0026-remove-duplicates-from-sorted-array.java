class Solution {
    
    public int removeDuplicates(int[] nums) {
        int n = nums.length, count = 1;
        if (n == 1) return 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[count++] = nums[i];
            }
        }

        return count;
    }
}