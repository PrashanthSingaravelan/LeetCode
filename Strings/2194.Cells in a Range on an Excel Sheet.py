class Solution:
    def cellsInRange(self, s: str) -> List[str]:
        str1, num1, str2, num2 = s[0], int(s[1]), s[3], int(s[4])
        ans = []
        cnt = 0  ## to increment the characters
        for i in range(ord(str1), ord(str2)+1): ## characters
            char_str = chr(ord(str1) + cnt)     ## fixed character with (variable integers)
            for j in range(num1, num2+1):       ## to increement the integers
                ans.append(char_str + str(j))
            cnt+=1
        
        return ans