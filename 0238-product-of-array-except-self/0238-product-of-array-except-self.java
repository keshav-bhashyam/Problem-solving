class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] answer = new int[len];

        answer[0] = 1;
        for (int i = 1; i < len; i++) {
            answer[i] = nums[i - 1] * answer[i - 1];
        }

        int rValue = 1;
        for (int i = len - 1; i >=0; i--) {
            answer[i] = rValue * answer[i];
            rValue *= nums[i];
        }

        return answer;
    }
}