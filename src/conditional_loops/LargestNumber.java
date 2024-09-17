package conditional_loops;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        // Q: to find the largest number

        int max =a;

        if (b > max){
            max = b;

        }
        if (c >max) {
            max = c;

        }
         if(d>max) {
            max = d;

        }

            System.out.println("largest number is "+ max);

    }


}
