package flow_of_program_01;

import java.util.Scanner;

public class multiply_table {

    public static void main(String[] args) {

       Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
       int number = in.nextInt();

       for (int i = 0; i <=10; i++){
           System.out.println( number + " * " + i + " = " + number*i);
       }



    }


}
