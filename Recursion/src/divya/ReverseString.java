// https://leetcode.com/problems/reverse-string/

package divya;

public class ReverseString {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        solve(s, i, j);
    }

    public void solve(char[] s, int i, int j){
        if(i >= j)
            return;
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        solve(s, i+1, j-1);
    }
}
