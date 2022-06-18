package divya;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nRows = s.nextInt();
        int currRow = 1;

        int i = nRows;
        while (currRow <= nRows) {
            int space = 1;
            while (space <= currRow-1) {
                System.out.print(" ");
                space += 1;
            }

            int currcol = 1;
            while (currcol <= i) {
                System.out.print("*");
                currcol += 1;
            }
            System.out.println();
            currRow += 1;
            i -= 1;
        }
    }
}
