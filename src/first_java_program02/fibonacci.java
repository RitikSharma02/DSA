package first_java_program02;

import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        System.out.println("enter a number up to which you want a fibonacci series");
        Scanner in = new Scanner(System.in);
        int nth = in.nextInt();
        int first = 0;
        int second = 1;

        for (int i = 1; i < nth; i++) {
            System.out.println(first + " ");
            int next = first + second;
             first = second;
            second = next;
        }
    }
}
