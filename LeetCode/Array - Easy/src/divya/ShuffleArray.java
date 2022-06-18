// https://leetcode.com/problems/shuffle-the-array/

package divya;

public class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        for(int i = 0; i < n; i++){
            ans[i+i] = nums[i];
            ans[1+i+i] = nums[n+i];
        }
        return ans;
    }
}
