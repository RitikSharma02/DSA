package conditional_loops_03;

import java.util.Scanner;


// to find the nth of a  fibonacci series

public class Fibonacci {



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int a =0;
        int b=1;
        int count =2;

//        System.out.println(0);
//        System.out.println(1);
        while (count <= n){
            int temp = b;
            b=b+a;
            a=temp;
            count++;
//            System.out.println(b);
        }
        System.out.println(b);


    }
}
