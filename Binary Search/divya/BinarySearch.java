package divya;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-12, -4, 1, 2, 4, 6, 12, 35, 80,99};
        int ans = binarySearch(arr, 35);
        System.out.println(ans);
    }


    // return index
    // return -1 if it does not exist
    static int binarySearch(int[] arr, int target){
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
        return -1;
    }
}
