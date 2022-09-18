class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        ans = []
        for i in range(len(nums)):
            element = nums[i]
            cnt = 0
            for j in range(len(nums)):
                if (element > nums[j]):
                    cnt+=1
            ans.append(cnt)
        return ans
        