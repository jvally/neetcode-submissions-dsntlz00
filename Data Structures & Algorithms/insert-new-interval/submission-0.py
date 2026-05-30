class Solution:
    def insert(self, intervals: List[List[int]], newInterval: List[int]) -> List[List[int]]:
        res = []

        for i in range(len(intervals)):
            if newInterval[1] < intervals[i][0]:#non-overlapping and on the left
                res.append(newInterval)
                return res + intervals[i:]
            
            elif newInterval[0] > intervals[i][1]:#non-overlapping and on the right
                res.append(intervals[i])
                

            else:#overlapping cases
                newInterval = min(newInterval[0], intervals[i][0]), max(newInterval[1], intervals[i][1])

        res.append(newInterval)#in case the return does not execute

        return res 