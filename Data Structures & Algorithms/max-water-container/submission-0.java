class Solution {
    public int maxArea(int[] heights) {
        int maximum = 0;
        int left = 0, right = heights.length - 1;
        while(left < right){
            int area = Math.min(heights[left], heights[right]) * (right - left);
            maximum = Math.max(area, maximum);
            if(heights[right] > heights[left]){
                left++;
            } else {
                right--;
            }
            
        }
        return maximum;
    }
}
