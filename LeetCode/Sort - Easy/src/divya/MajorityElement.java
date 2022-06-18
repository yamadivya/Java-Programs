package divya;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int count = 1;
        int val = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (val != nums[i]) {
                count--;
                if (count == 0) {
                    count = 1;
                    val = nums[i];
                }
            }
            else count++;
        }
        return val;
    }
}
