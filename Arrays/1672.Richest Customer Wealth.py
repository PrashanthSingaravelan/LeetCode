class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        max_list = []
        for i in accounts:
            max_list.append(sum(i))
        return max(max_list)
        