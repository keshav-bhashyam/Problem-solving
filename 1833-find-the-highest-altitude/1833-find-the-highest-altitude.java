class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length, maxGain = 0;
        int[] netGain = new int[n + 1];

        netGain[0] = 0;

        for (int i = 1; i <= n; i++) {
            netGain[i] = netGain[i - 1] + gain[i - 1];
            maxGain = Math.max(maxGain, netGain[i]);
        }

        // System.out.println(Arrays.toString(netGain));

        return maxGain;
    }
}