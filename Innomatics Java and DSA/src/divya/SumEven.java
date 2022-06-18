package divya;

import java.util.Scanner;

public class SumEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int n = in.nextInt();
        if (n % 2 == 0){
            while (n > 0) {
                sum = sum + n;
                n = n - 2;
            }
            System.out.println("Sum = " + sum);
        }
        else {
            while (n > 0) {
                sum = sum + n-1;
                n = n - 2;
            }
            System.out.println("Sum = " + sum);
        }
    }
}
