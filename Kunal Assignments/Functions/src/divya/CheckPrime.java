package divya;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String res = Prime(num);
        System.out.println(res);
    }

    static String Prime(int num){
        int i = 2;
        double a = Math.sqrt(num);
        while (i <= a){
            if (num % i == 0){
                return "Not Prime";
            }
            i+=1;
        }
        return "Prime";
    }
}
