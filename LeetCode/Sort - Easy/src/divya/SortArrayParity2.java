// https://leetcode.com/problems/sort-array-by-parity-ii/

package divya;

public class SortArrayParity2 {
    public int[] sortArrayByParityII(int[] nums) {
        int oddInd = nums.length-1;
        int i = 0;
        while(i<nums.length) {
            if(nums[i]%2!=0) {
                swap(nums, i, oddInd);
                oddInd -= 2;
            } else {
                i+=2;
            }
        }
        return nums;
    }

    public void swap(int arr[], int p1, int p2) {
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }
}
