package divya;

public class PowofTwo {
    public static void main(String[] args) {
        int n = 32; // Note : Fix for n=0
        boolean ans = (n & (n-1)) == 0;
        System.out.println(ans);
    }
}
