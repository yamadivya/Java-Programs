package divya;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for (int i=0; i<row; i++) {
            for (int j=0; j<=i-1; j++ )
            {
//prints star
                System.out.print(" ");
            }
            for (int j=row-i; j>=1; j--)
            {
//prints space between two stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
