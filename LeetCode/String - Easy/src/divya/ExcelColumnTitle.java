// https://leetcode.com/problems/excel-sheet-column-title/

package divya;

public class ExcelColumnTitle {
    public String convertToTitle(int n) {
        StringBuilder str = new StringBuilder();
        int r=0;
        char ch=' ';
        while(n!=0)
        {
            r = n%26;
            if(r ==0){
                str.append('Z');
                n = (n/26)-1;
                continue;
            }
            ch = (char)(65+r-1);
            str.append(ch);

            n = n/26;
        }
        str.reverse();
        return str.toString();
    }
}
