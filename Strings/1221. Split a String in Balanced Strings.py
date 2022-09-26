class Solution:
    def balancedStringSplit(self, s: str) -> int:
        ans   = []
        list1 = []  ## stack

        r_count = 0
        l_count = 0

        for i in s:
            if (i=='R'): 
                list1.append(i)
                r_count+=1

            elif (i=='L'): 
                list1.append(i)
                l_count+=1

            if (r_count == l_count):
                ans.append(''.join(list1))
                list1 = []
        
        return len(ans)