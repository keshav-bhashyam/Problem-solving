class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];

        Map<Integer, Integer> frequency = new HashMap<>();

        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        Map<Integer, Integer> collect = frequency.entrySet()
                .stream()
                .max((o1, o2) -> o1.getValue().compareTo(o2.getValue()))
                .stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey, Map.Entry::getValue));

        return collect.keySet().stream().findFirst().get();
    }
}