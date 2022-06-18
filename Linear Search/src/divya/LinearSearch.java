package divya;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 19;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    // search for target element in array, if found return index
    // otherwise return -1

    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        // run for loop
        for (int index = 0; index <= arr.length; index++){
            // check for element at every index if it is equal to target
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        // this line will execute if none of the above return statements have executed
        // hence target not found
        return -1;
    }
}
