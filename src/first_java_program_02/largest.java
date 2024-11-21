package first_java_program_02;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = in .nextInt();
        System.out.println("Enter the second number");
        int num2 = in .nextInt();
       int largest =0;
        if(num1>num2){
           largest = num1;
        }
        else {
            largest = num2;
        }
        System.out.println("largest from these two is : "+ largest);
    }


}
