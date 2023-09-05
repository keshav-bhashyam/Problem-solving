class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        int l = 0, r = 0, numberOfZeroes = 0;

        while (r < nums.length) {
            if (nums[r] == 0) {
                numberOfZeroes++;
            }

            while (numberOfZeroes >= 2) {
                if (nums[l] == 0) {
                    numberOfZeroes--;
                }
                l++;
            }

            maxOnes = Math.max(maxOnes, r - l + 1);
            r++;
        }

        return maxOnes;
    }
}