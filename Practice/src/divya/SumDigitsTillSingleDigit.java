package divya;

import java.util.Scanner;

public class SumDigitsTillSingleDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum1 = 0;
        int sum = 0;
        int num = in.nextInt();
        while (num > 0){
            int rem1 = num % 10;
            sum1 = sum1 + rem1;
            num = num / 10;
        }
        while (sum1 > 0){
            int rem = sum1 % 10;
            sum = sum + rem;
            sum1 = sum1 / 10;
        }
        System.out.println(sum);
    }
}
