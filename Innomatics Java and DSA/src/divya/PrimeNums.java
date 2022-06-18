package divya;

import java.util.Scanner;

public class PrimeNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = 2;
        int end = in.nextInt();
        for (int num = start; num <= end; num++) {
            if (Prime(num)){
                System.out.print(num + " ");
            }
        }
    }

    static boolean Prime(int num) {
        int i = 2;
        double a = Math.sqrt(num);
        while (i <= a) {
            if (num % i == 0) {
                return false;
            }
            i += 1;
        }
        return true;
    }
}

