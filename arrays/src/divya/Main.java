package divya;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // store 5 roll nos

        // Array of Primitives
        int[] rnos = new int[5];
        // or directly
        int[] rnos2 = {13,52,67,31,2};
        // Array will have elements of same datatype
        int[] ros; // declaration of array. ros is getting defined in the stack. Happens at compile time
        ros = new int[5]; // initialization : the object is being created in the heap. Happens at runtime
        // In Java array object may not be continuous as in heap objects are not stored in continuous manner.
        // It depends on JVM if the objects are place continuously

        // null can be assigned to non-primitive data types  but not primitive data type
        int num = null;
        String name = null;
        // Primitive type are stored in stack memory. Non=Primitive type string, class are stored in heap memory.

        // input using for loops
        for (int i = 0; i < rnos.length; i++){
            rnos[i] = sc.nextInt();
        }

        for (int i = 0; i < rnos.length; i++){
            System.out.println(rnos[i] + " ");
        }

        // Array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++){
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
