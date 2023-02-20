# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:

    def preorder(self, start):
        if start: ## root, left, right
            self.preorder(start.left)
            self.preorder(start.right)
            start.left, start.right = start.right, start.left
        return start

    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        if root:
            return self.preorder(root)
            