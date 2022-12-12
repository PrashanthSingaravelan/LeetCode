class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String combine_word1 = "";
        String combine_word2 = "";
        
        for(String i:word1) { combine_word1 += i; }
        for(String i:word2) { combine_word2 += i; }

        if (combine_word1.equals(combine_word2))
            return true; 
        else 
            return false;
    }
}