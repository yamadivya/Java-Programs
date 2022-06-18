package divya;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nRows = s.nextInt();

        int currRow = 1;
        int i = nRows;
        while (currRow <= nRows) {
            // print cols for currRow times

            int currCol = 1;
            while (currCol <= i) {
                // Print numbers
                System.out.print(currCol);
                currCol += 1;
            }
            System.out.println();
            currRow += 1;
            i -= 1;
        }

    }
}
