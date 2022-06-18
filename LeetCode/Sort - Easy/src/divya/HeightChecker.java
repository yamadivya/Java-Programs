// https://leetcode.com/problems/height-checker/

package divya;
import java.util.Arrays;
public class HeightChecker {
    public int heightChecker(int[] heights) {
        int count = 0;
        int[] expected = new int[heights.length];
        for(int i=0; i<heights.length; i++){
            expected[i] = heights[i];
        }
        Arrays.sort(expected);
        for(int j=0; j<expected.length; j++){
            if(expected[j] != heights[j]) count++;
        }
        return count;
    }
}
