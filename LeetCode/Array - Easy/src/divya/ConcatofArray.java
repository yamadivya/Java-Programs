// https://leetcode.com/problems/concatenation-of-array/

package divya;

public class ConcatofArray {
        public int[] getConcatenation(int[] nums) {
            int[] ans = new int[2*nums.length];
            for (int i = 0; i < nums.length; i++){
                ans[i] = nums[i];
            }
            for (int i = nums.length; i < ans.length; i++){
                ans[i] = nums[i-nums.length];
            }
            return ans;
        }
    }
