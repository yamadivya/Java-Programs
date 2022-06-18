package divya;
import java.util.Scanner;
public class Pattern1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nRows = s.nextInt();
        int currRow = 1;

        while (currRow <= nRows) {

            int space = 1;
            while (space <= nRows - currRow) {
                System.out.print(" ");
                space += 1;
            }

            int stars = 1;
            while (stars <= 2*currRow-1) {
                System.out.print("*");
                stars += 1;
            }
            System.out.println();
            currRow += 1;
        }

    }
}
