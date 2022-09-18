class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
        word_count = []
        for i in range(len(sentences)):
            word_count.append(len(sentences[i].split(' ')))
            
        return max(word_count)
        