package divya;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(pow(b,e));
    }

    static int pow( int a, int b){
        if (b == 0) {
            return 1;
        }

        int ans = a * pow(a, b - 1);
        return ans;
    }
}

