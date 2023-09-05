class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;

        for (int i = 0; i < nums.length; i++) {
            int numberOfZeroes = 0;

            for (int j = i; j < nums.length; j++) {
                if (nums[j] == 0) {
                    numberOfZeroes++;
                }

                if (numberOfZeroes <= 1) {
                    maxOnes = Math.max(maxOnes, j - i + 1);
                }
            }
        }
        return maxOnes;
    }
}