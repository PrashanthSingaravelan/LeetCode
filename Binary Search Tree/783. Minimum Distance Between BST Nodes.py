# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def __init__(self):
        self.list1 = []

    def minimum_distance(self, elements):
        mini = sys.maxsize
        for i in range(len(elements)):
            for j in range(i+1, len(elements)):
                diff = abs(elements[i] - elements[j])
                if mini > diff:
                    mini = diff
        return mini
    
    def preorder(self, start):
        if start: ## root, left, right
            self.list1.append(start.val)
            self.preorder(start.left)
            self.preorder(start.right)
            
    def minDiffInBST(self, start):
        self.preorder(start)
        return self.minimum_distance(self.list1)  
        