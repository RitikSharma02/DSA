package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

    public static void main(String[] args) {
        // syntax
        ArrayList<Integer> list = new ArrayList<>(10);

        Scanner in = new Scanner(System.in);
        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));// pass index here list[index], will not work here
        }

        System.out.println(list);




        //
//        list.add(123);
//        list.add(13);
//        list.add(654);
//        list.add(123);
//        list.add(123);
//
//
//        System.out.println(list.contains(654));
//
//list.set(0, 99);
//        System.out.println(list);
//
//        list.remove(1);
//
//        System.out.println(list);

    }
}
