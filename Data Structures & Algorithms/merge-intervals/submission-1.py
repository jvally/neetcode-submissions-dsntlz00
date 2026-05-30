class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort(key = lambda i:i[0])#sort by first value
        output = [intervals[0]]

        for start, end in intervals[1:]:
            latest_end = output[-1][1]

            if start <= latest_end:
                output[-1][1] = max(latest_end, end)
            else:
                output.append([start,end])

        return output

