class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        if len(nums) == 1:
            return [nums]

        perms = self.permute(nums[1:])#break into subproblem
        res = []

        for p in perms:
            for i in range(len(p) + 1):#for every position,insert
                new_p = p.copy()
                new_p.insert(i, nums[0])
                res.append(new_p)

        return res