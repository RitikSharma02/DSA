package flow_of_program_01;

import java.util.Scanner;
public class sum_of_Inputs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;

        //for loop that runs indefinitely
        for (;;) {
            System.out.println("Enter a number or 'x' to exit:");
            String input = in.next();

            if (input.equalsIgnoreCase("x")) {
                break;
            }

            int number = Integer.parseInt(input);
            sum += number;

        }

        System.out.println("Total sum is: " + sum);

    }
}

