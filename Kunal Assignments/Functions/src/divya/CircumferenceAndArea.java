package divya;

import java.util.Scanner;

public class CircumferenceAndArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int radius = in.nextInt();
        double circum = circumference(radius);
        System.out.println(circum);
        double area = area(radius);
        System.out.println(area);
    }

    static double circumference(int r){
        double C = 2 * 3.14 * r;
        return C;
    }

    static double area(int r){
        double A = 3.14 * r * r;
        return A;
    }
}
