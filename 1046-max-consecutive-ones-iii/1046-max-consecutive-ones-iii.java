class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxOnes = 0, l = 0, r = 0, numZeroes = 0;

        while (r < nums.length) {
            if (nums[r] == 0) {
                numZeroes++;
            }

            while (numZeroes > k) {
                if (nums[l] == 0) {
                    numZeroes--;
                }
                l++;
            }

            maxOnes = Math.max(maxOnes, r - l + 1);
            r++;
        }

        return maxOnes;
    }
}