// https://leetcode.com/problems/shuffle-string/

package divya;

public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        char charAr[]=new char[s.length()];
        String ans="";

        for(int i=0;i<s.length();i++)
        {
            charAr[indices[i]]=s.charAt(i);

        }

        for(int i=0;i<charAr.length;i++)
        {
            ans+=charAr[i];
        }

        return ans;
    }
}
