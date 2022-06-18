package divya;
import java.util.*;
public class ProductOfTwoNums {
    public static void main(String[] args) {
        int x = 5, y = 2;
        System.out.println(product(x, y));
    }

    static int product(int x, int y)
    {
        // if x is less than
        // y swap the numbers
        if (x < y)
            return product(y, x);

            // iteratively calculate
            // y times sum of x
        else if (y != 0)
            return (x + product(x, y - 1));

            // if any of the two numbers is
            // zero return zero
        else
            return 0;
    }
}
