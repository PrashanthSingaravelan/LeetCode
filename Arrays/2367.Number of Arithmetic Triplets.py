class Solution:
    def arithmeticTriplets(self, nums: List[int], diff: int) -> int:
        ans = []
        for i in range(len(nums)):
            for j in range(i+1, len(nums)-2):
                for k in range(j+1,len(nums)-1):
                    if (nums[j] - nums[i] == diff) and (nums[k] - nums[j] == diff):
                        ans.append((i,j,k))
        return len(ans)

