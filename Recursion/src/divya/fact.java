package divya;

public class fact {
    public static void main(String[] args) {
        fact(5);
    }

    static int fact(int n){
        if (n <= 1){
            return 1;
        }
        return n * fact(n-1);
    }
}
