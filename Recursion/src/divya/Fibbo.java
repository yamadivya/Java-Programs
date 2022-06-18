package divya;

public class Fibbo {
    public static void main(String[] args) {
        int ans = fibo(3);
        System.out.println(ans);
    }

    static int fibo(int n) {
        // base condition
        if (n == 1 || n == 0) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
