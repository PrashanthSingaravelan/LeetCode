class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        ans = []
        for i in range(len(nums)):
            for j in range(i, len(nums)):
                if (nums[i] == nums[j]) and (i<j):
                    ans.append((i,j))
        return (len(ans))
        