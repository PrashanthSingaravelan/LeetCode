"""
# Definition for a Node.
class Node:
    def __init__(self, val=None, children=None):
        self.val = val
        self.children = children
"""

class Solution:
    def preorder(self, root: 'Node') -> List[int]:

        def dfs(root):
            if root:
                stack.append(root.val)
                for i in root.children:
                    dfs(i)

        stack = []    
        dfs(root)
        return stack