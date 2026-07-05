class Solution:
    def maxArea(self, heights: List[int]) -> int:
        l = 0
        r = len(heights) - 1
        vol = 0

        #move pointers inwards
        while l < r:
            area = min(heights[l], heights[r]) * (r- l)#calcualte area for each valid range
            vol = max(area, vol)
            if heights[l] <= heights[r]:#oni advantageous to reudce width if height can increase
                l += 1
            else:
                r -= 1
            
        return vol