import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        float num = input.nextFloat();
        System.out.println("Enter second number");
        int num2 = input.nextInt();
        float sum = num+num2;
        System.out.println(sum);
}}

