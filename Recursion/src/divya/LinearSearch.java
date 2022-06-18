package divya;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 5};
        System.out.println(findIndex(arr, 1,0));
    }

    static int findIndex(int[] arr, int target, int index){
        if (index == arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        else {
            return findIndex(arr, target, index+1);
        }
    }
}
