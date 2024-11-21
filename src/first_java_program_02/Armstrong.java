package first_java_program_02;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int numDigits = String.valueOf(number).length();
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }


//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a Number: ");
//        int number = in.nextInt();
//        String strNumber= String.valueOf(number);
//        int exponent = strNumber.length();
//        int count = 0;
//
//        for (int i = 0; i < strNumber.length(); i++) {
////            int digit = strNumber.charAt(i) - '0';
//            int digit = Character.getNumericValue(strNumber.charAt(i));
//            count += (int) Math.pow(digit, exponent);
//        }
//      if(number ==count){
//          System.out.println("ArmStrong");
//      }
//      else{
//          System.out.println("not ArmStrong");
//      }
//
//
//    }
}
