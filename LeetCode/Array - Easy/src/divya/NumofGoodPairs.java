// https://leetcode.com/problems/number-of-good-pairs/

package divya;

public class NumofGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                if (nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
