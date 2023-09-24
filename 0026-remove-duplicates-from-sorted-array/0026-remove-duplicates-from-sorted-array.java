class Solution {
    
    public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> counter = new LinkedHashMap<>();
        int k = 0, n = nums.length;

        for (int i = 0; i < n; i++) {
            counter.put(nums[i], counter.getOrDefault(nums[i], 0) + 1);
        }

        for (Integer key : counter.keySet()) {
            nums[k++] = key;
        }
        return counter.keySet().size();
    }
}