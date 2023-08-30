class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> output = new ArrayList<>();
        int maxCandies = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            maxCandies = Math.max(maxCandies, candies[i]);
            candies[i] += extraCandies;
        }

        for (int i = 0; i < candies.length; i++) {
            output.add(candies[i] >= maxCandies);
        }

        return output;
    }
}