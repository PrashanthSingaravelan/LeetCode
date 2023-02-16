"""
# Definition for a Node.
class Node:
    def __init__(self, val=None, children=None):
        self.val = val
        self.children = children
"""

class Solution:

    def postorder(self, root: 'Node') -> List[int]:
        list1 = []

        def dfs(root):
            if root:
                for i in root.children:
                    dfs(i)
                list1.append(root.val)

        dfs(root)
        return list1

        

        