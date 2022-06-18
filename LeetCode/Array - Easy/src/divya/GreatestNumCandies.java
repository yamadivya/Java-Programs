// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
package divya;
import java.util.*;
public class GreatestNumCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result = new ArrayList<Boolean>(candies.length);
        for (int i = 0; i < candies.length; i++){
            int m = candies[i] + extraCandies;
            int count=0;
            for (int j=0;j<candies.length;j++){
                if (m>=candies[j]){
                    count+=1;
                }
            }
            if (count == candies.length){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
}
