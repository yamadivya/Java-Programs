package divya;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(34);
        list.add(4);
        list.add(53);
        list.add(872);
        list.add(3);
        list.add(241);
        list.add(3447);
        list.add(34215);
        list.add(30934);
        list.add(3124);
        list.add(348);

        System.out.println(list);

        System.out.println(list.contains(342));

        list.set(0, 99);
        list.remove(2);
        System.out.println(list);

        //input
        for (int i = 0; i < 5; i++){
            list.add(in.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++){
            System.out.println(list.get(i));
        }
    }
}
