class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean answer = true;
        boolean increasing = false;
        int n = nums.length;

        if (n == 1) return true;

        if (nums[0] <= nums[n - 1]) increasing = true;

        if (increasing) {
            for (int i = 1; i < n; i++) {
                if (nums[i - 1] > nums[i]) answer = false;
            }
        } else {
            for (int i = 1; i < n; i++) {
                if (nums[i - 1] < nums[i]) answer = false;
            }
        }

        return answer;
    }
}