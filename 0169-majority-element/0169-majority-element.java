class Solution {
    public int majorityElement(int[] nums) {
         int n = nums.length;
        if (n == 1) return nums[0];

        Map<Integer, Integer> frequency = new HashMap<>();

        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        return frequency.entrySet()
                .stream()
                .max((a, b) -> a.getValue().compareTo(b.getValue()))
                .get()
                .getKey();
    }
}