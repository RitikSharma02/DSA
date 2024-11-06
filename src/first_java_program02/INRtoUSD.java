package first_java_program02;

import java.util.Scanner;

public class INRtoUSD {

    public static void main(String[] args) {
        System.out.println("Enter the Amount in INR : ");
        Scanner in= new Scanner(System.in);
        int amount = in.nextInt();
        double USD = amount * 84.33;

        System.out.println(amount + " INR makes up " + USD + " USD");

    }
}
