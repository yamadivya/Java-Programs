package divya;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = sum(a, b);
        System.out.println(sum);
    }

    static int sum(int x, int y){
        int sum = x + y;
        return sum;
    }
}
