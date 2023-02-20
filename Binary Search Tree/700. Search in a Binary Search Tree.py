# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:

    ## root, left, right
    def preorder(self, start, val):
        if start:                 
            if start.val == val:
                return start
            
    ## val greater than start.val (go only to right)
            if (val > start.val):
                return self.preorder(start.right, val)

    ## val lesser than start.val (go only to left)
            if (val < start.val):
                return self.preorder(start.left, val)

    def searchBST(self, root: Optional[TreeNode], val: int) -> Optional[TreeNode]:
        return self.preorder(root, val)