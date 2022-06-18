// https://leetcode.com/problems/count-items-matching-a-rule/

package divya;

import java.util.List;

public class CountItemMatchRule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int n = -1, count = 0;
        if(ruleKey.equals("type"))
            n = 0;
        else if(ruleKey.equals("color"))
            n = 1;
        else if(ruleKey.equals("name"))
            n = 2;

        for(List<String> item: items){
            if(item.get(n).equals(ruleValue))
                count++;
        }
        return count;
    }
}
