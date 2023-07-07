class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str: 
        res = ""
        strs = sorted(strs)
        first = strs[0]
        last = strs[-1]
        for x in range(len(first)):
            if(first[x] != last[x]):
                return res
            res += first[x]
        return res
