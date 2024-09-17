package Switch_statements;

import java.util.Scanner;

public class Enhanced_switch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("Enter a fruit");
//    String fruit = in.next();
   int day = in.nextInt();
        System.out.println();
//
//        switch (fruit) {
//            case "mango" -> System.out.println("King of fruits");
//            case "Apple" -> System.out.println("A sweet red fruit");
//            case "orange" -> System.out.println("sour and healthy");
//            case "Grapes" -> System.out.println("not a fruit ");
//            default -> System.out.println("I don't have that fruit in inventory : ");
//        }

        switch (day){
            case 1,2,3,4,5 -> System.out.print("weekday");
            case 6,7 -> System.out.print("weekends");
        }
    }
}
