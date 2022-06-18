package divya;

import java.util.Arrays;
import java.util.Scanner;

public class SortZeroOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int countZero = 0;
        int countOne = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                countZero+=1;
            }
            else {
                countOne+=1;
            }
        }
        for (int i = 0; i < countZero; i++){
            arr[i] = 0;
        }
        for (int i = countZero; i < arr.length; i++){
            arr[i] = 1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
