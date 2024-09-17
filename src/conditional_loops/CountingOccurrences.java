package conditional_loops;

import java.util.Scanner;


// to find the Occurrences of a number in a digit

public class CountingOccurrences {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a digit ");
        int digit = input.nextInt();
        int count =0;
        System.out.println("enter number you want to count occurrences");
int n =input.nextInt();

        while (digit >0){
            int rem = digit % 10;

            if(rem == n){

              count++;

            }
            digit = digit /10;
        }
        System.out.println(count);


    }
}
