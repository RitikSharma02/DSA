package first_java_program_02;

import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (;;) {
            System.out.println("Enter a number : ");
            int number = in.nextInt();

            if(number%2==0){
                System.out.println(number + " is a even number");
            }
            else {
                System.out.println(number + " is a odd number");
            }
        }
    }
}
