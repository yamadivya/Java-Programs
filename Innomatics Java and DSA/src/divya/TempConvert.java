package divya;

import java.util.Scanner;

public class TempConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int E = sc.nextInt();
        int W = sc.nextInt();
        if (S >= 0 && S <= 80 && E >= S && E <= 900 && W >= 0 && W <= 40){
            for (int i = S; i <= E; i = i + W){
                int celsius = (int) ((i - 32)*5/9.0);
                System.out.println(i + "\t" + celsius);
            }
        }
        else {
            System.out.println(-1);
        }
    }
}
