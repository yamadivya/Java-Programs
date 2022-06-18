package divya;

import java.util.Scanner;

public class ProductDivisibleSumCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int prod = 1;
        int n = in.nextInt();
        int a = n;
        while (n > 0){
            prod = prod * n;
            n = n - 1;
        }
        while (a > 0){
            sum = sum + a;
            a = a - 1;
        }
        if (prod % sum == 0){
            System.out.println("YES");
        }
        else {
            System.out.println("No");
        }
    }
}
