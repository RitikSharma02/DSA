package FunctionsOrMethods;
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number to check : ");
        int number = in.nextInt();
        boolean ans = isPrime(number);
        System.out.println(ans);
    }

    static boolean isPrime(int number) {
        if (number < 1) {
            return false;
        } else {
            int i = 2;
            while (i < Math.sqrt(number)) {
                if (number % i == 0) {
                    return false;
                }
                i++;
            }

            return i * i > number;
        }


    }

}
