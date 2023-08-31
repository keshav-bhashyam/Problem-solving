class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        int len = nums.length;

        left[0] = 1;
        for (int i = 1; i < len; i++) {
            left[i] = nums[i - 1] * left[i - 1];
        }
        right[len - 1] = 1;
        for (int i = len - 2; i >= 0; i--) {
            right[i] = nums[i + 1] * right[i + 1];
        }

        for (int i = 0; i < len; i++) {
            answer[i] = left[i] * right[i];
        }

        return answer;
    }
}