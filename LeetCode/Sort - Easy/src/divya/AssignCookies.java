// https://leetcode.com/problems/assign-cookies/

package divya;
import java.util.Arrays;
public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        int i=0;
        int j=0;
        int count=0;
        Arrays.sort(g);
        Arrays.sort(s);

        while(i<g.length && j<s.length){

            if(s[j]>=g[i]){
                count+=1;
                i++;
            }
            j++;
        }
        return count;
    }
}
