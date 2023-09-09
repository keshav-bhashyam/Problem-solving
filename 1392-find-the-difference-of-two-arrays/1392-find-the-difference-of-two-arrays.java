class Solution {
    private List<Integer> getDistinctFirstList(int[] nums1, int[] nums2) {
        Set<Integer> secondSet = new HashSet<>();
        Set<Integer> firstListElements = new HashSet<>();

        for (int num: nums2) {
            secondSet.add(num);
        }

        for (int num : nums1) {
            if (!secondSet.contains(num)) {
                firstListElements.add(num);
            }
        }

        return new ArrayList<>(firstListElements);
    }

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        return Arrays.asList(getDistinctFirstList(nums1, nums2), getDistinctFirstList(nums2, nums1));    
    }
}