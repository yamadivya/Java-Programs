package divya;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {-12, -4, 1, 2, 4, 6, 12, 35, 80,99};
        int ans = ceiling(arr, 3);
        System.out.println(ans);
    }
// return index of smallest number greater than or equal to target
    static int ceiling(int[] arr, int target){
        // but what if target is greater than the greatest number in array
        if (target > arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            // find middle element
            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else {
                // ans found
                return mid;
            }
        }
        return start;
    }
}
