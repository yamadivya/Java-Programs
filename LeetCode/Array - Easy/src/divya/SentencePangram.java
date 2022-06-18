// https://leetcode.com/problems/check-if-the-sentence-is-pangram/

package divya;

public class SentencePangram {

    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) {
            return false;
        }

        for(char c  = 'a'; c <= 'z'; c++)
            if(!sentence.contains(""+c))return false;
        return true;
    }
}
