// https://leetcode.com/problems/build-array-from-permutation/

package divya;

public class ArrayFromPermutation {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
