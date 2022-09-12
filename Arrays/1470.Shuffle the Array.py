class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        first_half  = nums[:n]
        second_half = nums[n:]
        
        ans = []
        for i,j in zip(first_half, second_half):
            ans.append(i)
            ans.append(j)
        return ans
        