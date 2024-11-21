package first_java_program_02;

import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the principal Amount : ");
        int principal = in.nextInt();
        System.out.println("Enter the Rate : ");
        int rate = in.nextInt();
        System.out.println("Enter the Time(in months) : ");
        int time = in.nextInt();

//        SI = P*R*T/100
        int SimpleInterest = (principal* rate * time)/1000;

        System.out.println("Simple Interest is : " + SimpleInterest);

    }
}
