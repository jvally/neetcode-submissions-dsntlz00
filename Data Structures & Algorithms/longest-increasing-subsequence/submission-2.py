class Solution:
    def lengthOfLIS(self, nums: List[int]) -> int:
        LIS = [1] * len(nums) #memoise the results

        for i in range(len(nums) - 1, -1, -1):#start from the back and dynamicaly build up
            for j in range(i + 1, len(nums)):
                if nums[i] < nums[j]:
                    LIS[i] = max(LIS[i], LIS[j] + 1)#2 choices take the current number or dont
        
        return max(LIS)


