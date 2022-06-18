package divya;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String check = check(num);
        System.out.println(check);
    }

    static String check(int num){
        if (num % 2 == 0){
            return "Even";
        }
        else {
            return "Odd";
        }
    }
}
