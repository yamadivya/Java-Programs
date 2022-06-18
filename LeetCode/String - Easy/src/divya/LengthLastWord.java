// https://leetcode.com/problems/length-of-last-word/

package divya;

public class LengthLastWord {
    public int lengthOfLastWord(String s) {
        int count = 0;
        boolean flag = false;
        for(int i = s.length()-1 ; i>=0 ; i--) {
            if(s.charAt(i) != ' ') {
                flag = true;
                count++;
            } else if(s.charAt(i) == ' ' && flag == true) {
                return count;
            }
        }
        return count;
    }
}
