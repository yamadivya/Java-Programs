// https://leetcode.com/problems/count-the-number-of-consistent-strings/

package divya;

public class CountConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        int consistentCount = 0;

        for(String each : words){
            int count = 0;
            for(int j = 0; j < each.length(); j++){
                if(allowed.contains(""+each.charAt(j))){
                    count++;
                }
            }
            if(count == each.length()){ //if not equal then there would be different chars which are not in allowed string
                consistentCount++;
            }
        }
        return consistentCount;
    }
}
