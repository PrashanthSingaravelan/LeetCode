# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        def dfs(root):
            if not root:
                return 0

            left_max = dfs(root.left) + 1
            right_max = dfs(root.right) + 1
            return max(left_max, right_max)
        return dfs(root)