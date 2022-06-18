// https://leetcode.com/problems/largest-perimeter-triangle/

package divya;
import java.util.Arrays;
public class LargestPeriTriangle {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        // 4 5 6 7 8 9
        for(int i=nums.length-1;i>=2;i--)
        {
            //checking that one side is smaller that the sum of the other two sides
            // from the last of a sorted array
            if(nums[i]<(nums[i-2]+nums[i-1]))
            {
                //if found return consecutive 3 point's sum for the perimeter
                return nums[i]+nums[i-2]+nums[i-1];
            }
        }
        //else if we don't found any , return zero.
        return 0;
    }
}
