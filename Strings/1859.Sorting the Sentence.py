class Solution:
    def sortSentence(self, s: str) -> str:
        ans = [None] * len(s.split())

        for i in s.split():
            index   = int(i[-1])-1
            element = str(i[:-1])

            ans[index] = str(element)

        return ' '.join(ans)