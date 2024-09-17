package conditional_loops;

import java.util.Scanner;

// to reverse a digit or number

public class Reverse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        int count =0;
        while (n>0){
            int rem = n%10;
            count = count*10 +rem;
            n=n/10;
        }
        System.out.println("Reverse of the number is \n"  + count);
    }
}
