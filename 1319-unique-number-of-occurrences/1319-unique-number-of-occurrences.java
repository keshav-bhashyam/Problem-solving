class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> counter = new HashMap<>();

        for (int num : arr) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }

        int[] values = counter.values().stream().mapToInt(x -> x).toArray();
        Arrays.sort(values);

        int prevValue = values[0];
        for (int i = 1; i < values.length; i++) {
            if (prevValue == values[i]) return false;
            prevValue = values[i];
        }

        return true;
    }
}