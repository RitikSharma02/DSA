package first_java_program02;

import java.util.Scanner;

public class greetings {

    public static void main(String[] args) {
        System.out.println("Enter the name: ");
      Scanner in = new Scanner(System.in);

      String name = in.next();

        System.out.println("Hello "+ name + " how are you ? ");
    }
}
