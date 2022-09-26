from collections import OrderedDict
class Solution:
    def decodeMessage(self, key: str, message: str) -> str:
        key_nospace                = key.replace(' ', '')  ## remove the spaces
        key_nospace_norepeat = "".join(OrderedDict.fromkeys(key_nospace)) ## remove duplicates with order
        
        list1 = [chr(i) for i in range(ord('a'), ord('z')+1)]
        str1  = str(''.join(list1))   ## a to z
        
        ans = []
        for i in message:
            element = i  ## take one element in the message
            for j in range(len(key_nospace_norepeat)):   ## Going through the key
                if (element == key_nospace_norepeat[j]): ## if element in key (replace that element with the index in str1)
                    ans.append(str1[j])
            if (element==' '):  ## if there is some space, leave that space
                ans.append(' ')
        return ''.join(ans)
        