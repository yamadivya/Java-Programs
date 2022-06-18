package divya;

import java.util.Scanner;

public class SumNaturalNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int n = in.nextInt();
        while (n > 0){
            sum = sum + n;
            n = n - 1;
        }
        System.out.println("Sum = " + sum);
    }
}
