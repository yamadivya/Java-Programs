package divya;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {-12, -4, 1, 2, 4, 6, 12, 35, 80,99};
        int ans = floor(arr, 12);
        System.out.println(ans);
    }
// return index of greatest number less than or equal to target
    static int floor(int[] arr, int target){

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
        return end;
    }
}
