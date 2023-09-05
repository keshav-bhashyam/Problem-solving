class Solution {
    public int maxArea(int[] height) {
        int maxArea = -1;
        int l = 0, r = height.length - 1, width = -1;

        while (l < r) {
            width = r - l;
            if (height[l] < height[r]) {
                maxArea = Math.max(maxArea, height[l] * width);
                l++;
            } else {
                maxArea = Math.max(maxArea, height[r] * width);
                r--;
            }
        }
        return maxArea;
    }
}