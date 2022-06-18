// https://leetcode.com/problems/search-insert-position/

package divya;

public class SearchInsertPos {
    public int searchInsert(int[] nums, int target) {
        int mid=0,L = nums.length-1,i=0;
        while(i<=L){
            mid=(i+L)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid]<target) i=mid+1;
            else L=mid-1;

        }
        return i;
    }
}
