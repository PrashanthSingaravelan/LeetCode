# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def rangeSumBST(self, root: Optional[TreeNode], low: int, high: int) -> int:
        arr=[]
        def pre_order_traversal(node):
            if node:
                if(node.val>=low and node.val<=high):
                    arr.append(node.val)
                pre_order_traversal(node.left)
                pre_order_traversal(node.right)
        pre_order_traversal(root)        
        return sum(arr)  