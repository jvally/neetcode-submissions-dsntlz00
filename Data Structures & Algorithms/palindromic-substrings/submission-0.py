class Solution:
    def countSubstrings(self, s: str) -> int:
        #expand from the middle idea, for each char expand out left n right 
        #if still palidrome +1 to count n conitnue expanding until not palidrome then shift to next char
        count = 0
        for i in range(len(s)):
            l = r = i#for odd length palidromes
            while  l >= 0 and r < len(s) and s[l] == s[r]:#not out of bounds and palidrome
                l -= 1
                r += 1
                count += 1

            l = i
            r = i + 1#for oeven length palidromes
            while  l >= 0 and r < len(s) and s[l] == s[r]:#not out of bounds and palidrome
                l -= 1
                r += 1
                count += 1
            
        return count        

        