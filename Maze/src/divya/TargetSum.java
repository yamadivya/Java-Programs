package divya;

public class TargetSum {
    int count = 0;

    public int findTargetSumWays(int[] nums, int target) {
        helper(nums, 0, 0, target);
        return count;
    }

    private void helper(int[] nums, int i, int sum, int target) {
        if (i == nums.length) {
            if (sum == target)
                count++;
            return;
        }
        helper(nums, i + 1, sum + nums[i], target);
        helper(nums, i + 1, sum - nums[i], target);
    }
}
