// https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/

package divya;

public class NoOfStrAsSubstr {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String pattern : patterns) {
            if (word.indexOf(pattern) != -1) count++;
        }
        return count;
    }
}
