class Solution {
    public int maxOperations(int[] nums, int k) {
        int n = nums.length;
        if (nums.length == 1) return 0;

        Map<Integer, Integer> hm = new HashMap<>();
        int countOfOps = 0;

        for (int i = 0; i < n; i++) {
            int current = nums[i];
            int complement = k - nums[i];
            if (hm.getOrDefault(complement, 0) > 0) {
                hm.put(complement, hm.get(complement) - 1);
                countOfOps++;
            } else {
                hm.put(current, hm.getOrDefault(current, 0) + 1);
            }
        }

        return countOfOps;
    }
}