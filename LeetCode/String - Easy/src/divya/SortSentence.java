// https://leetcode.com/problems/sorting-the-sentence/

package divya;

public class SortSentence {
    public String sortSentence(String s) {
        String[] strArray = s.split(" ");
        String[] result = new String[strArray.length];
        for (String str : strArray) {
            char ch = str.charAt(str.length() - 1);
            int temp = Character.getNumericValue(ch);
            result[temp - 1] = str.substring(0, str.length() - 1);
        }
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < result.length; i++) {
            res = res.append(result[i]).append(" ");
        }
        String resultString  = res.toString().substring(0, res.toString().length() -1);

        return resultString;
    }
}
