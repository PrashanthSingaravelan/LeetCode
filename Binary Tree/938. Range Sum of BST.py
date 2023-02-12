# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val   = val
#         self.left  = left
#         self.right = right
class Solution:

    def inclusive_sum(self, node, sum1, low, high):
        if node:
            sum1 = self.inclusive_sum(node.left, sum1, low, high)
            if (node.val in range(low, high+1)):
                print("NODE-VALUE : ", node.val)
                sum1 = sum1 + node.val
            sum1 = self.inclusive_sum(node.right, sum1, low, high)
        return sum1

    def rangeSumBST(self, root: Optional[TreeNode], low: int, high: int) -> int:
        sum1 = 0
        return self.inclusive_sum(root, sum1, low, high)
