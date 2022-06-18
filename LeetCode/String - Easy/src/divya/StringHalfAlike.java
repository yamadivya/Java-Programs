// https://leetcode.com/problems/determine-if-string-halves-are-alike/

package divya;

public class StringHalfAlike {
    public boolean halvesAreAlike(String s) {
        int leftv = 0;
        int rv =0;
        int  m = s.length() / 2;
        for(int i =0; i<m; i++){
            char a = s.charAt(i);
            if(a == 'a' || a =='A' || a == 'e' || a == 'E' || a == 'i' || a == 'I' || a == 'o' || a == 'O' || a == 'u' || a == 'U'){
                leftv++;
            }
        }
        for(int n = m; n<s.length(); n++){
            char b = s.charAt(n);
            if(b == 'a' || b =='A' || b == 'e' || b == 'E' || b == 'i' || b == 'I' || b == 'o' || b == 'O' || b == 'u' || b == 'U'){
                rv++;

            }
        }
        if(leftv == rv){
            return true;
        }
        return false;
    }
}
