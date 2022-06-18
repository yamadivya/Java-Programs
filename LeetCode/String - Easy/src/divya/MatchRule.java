// https://leetcode.com/problems/count-items-matching-a-rule/
import java.util.*;
package divya;

public class MatchRule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans=0;
        if(ruleKey.equals("type"))
        {
            for (int i = 0; i <items.size() ; i++) {
                if(items.get(i).get(0).equals(ruleValue))//getting type value from items and comparing with ruleValue
                    ans++;
            }
        }
        if(ruleKey.equals("color"))
        {
            for (int i = 0; i <items.size() ; i++) {
                if(items.get(i).get(1).equals(ruleValue))//getting color value from items and comparing with ruleValue
                    ans++;
            }
        }
        if(ruleKey.equals("name"))
        {
            for (int i = 0; i <items.size() ; i++) {
                if(items.get(i).get(2).equals(ruleValue))//getting name value from items and comparing with ruleValue
                    ans++;
            }
        }
        return ans;
    }
}
