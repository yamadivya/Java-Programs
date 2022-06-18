package divya;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(CD(a));
    }

    static int CD(int n){
        if (n == 0){
            return 0;
        }
        else {
            int ans = 1 + CD(n/10);
            return ans;
        }
    }
}
