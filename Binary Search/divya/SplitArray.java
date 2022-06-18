package divya;

public class SplitArray {
    public static void main(String[] args) {

    }

    static int splitArray(int[] nums, int m){
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++){
            start = Math.max(start, nums[i]);
            end+=nums[i];
        }
        // binary search
        while (start < end){
            int mid = start + (end - start) / 2;
            // calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for (int num : nums){
                if (sum + num > mid){
                    // you cannot add this in this sub-array, make a new one
                    // say you add this num in new sub-array, then sum = num
                    sum = num;
                    pieces+=1;
                }
                else {
                    sum+=num;
                }
            }
            if (pieces > m){
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }
        return end;
    }
}
