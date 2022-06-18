package divya;

import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
              2 4 6
              4 2 7
              8 9 3
         */
        int[][] arr = new int[3][]; // no. of rows are mandatory not columns. 1st bracket is number of rows, 2nd bracket is columns

        int[][] array = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] s = {
                {1,2,3},     // 0th index
                {4,5},       // 1st index
                {5,7,3,1},   // 2nd index
        };
        // input
        int[][] arr2D = new int[4][5];
        System.out.println(arr2D.length); // no. of rows
        for (int row = 0; row < arr2D.length; row++){
            // for each col in every row
            for (int col = 0; col < arr2D[row].length; col++){
                arr2D[row][col] = sc.nextInt();
            }
        }

        // output
        for (int row = 0; row < arr2D.length; row++){
            // for each col in every row
            for (int col = 0; col < arr2D[row].length; col++){
                System.out.println(arr2D[row][col] + " ");
            }
            System.out.println();
        }

    }
}
