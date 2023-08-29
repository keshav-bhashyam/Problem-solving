class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                ans.add(map.get(complement));
                ans.add(i);
            }
            map.put(nums[i], i);
        }

        return ans.stream().mapToInt(x -> x).toArray();
    }
}