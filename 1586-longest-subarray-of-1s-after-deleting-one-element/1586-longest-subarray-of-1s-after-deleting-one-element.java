class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int l = 0, r = 0, numZeroes = 0, maxOnes = 0;

        while (r < n) {
            if (nums[r] == 0) {
                numZeroes++;
            }

            while (numZeroes > 1) {
                if (nums[l] == 0) {
                    numZeroes--;
                }
                l++;
            }

            maxOnes = Math.max(maxOnes, r - l + 1);
            r++;
        }

        if (maxOnes == n) numZeroes = 1;

        return maxOnes - numZeroes;
    }
}

