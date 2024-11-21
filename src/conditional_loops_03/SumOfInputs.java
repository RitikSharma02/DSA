package conditional_loops_03;

import java.util.Scanner;

public class SumOfInputs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number to add & you can press '0' to get sum");
        int n = in.nextInt();
        int sum = 0;

while (n!=0){
    sum = sum+n;
    System.out.println("enter a number to add & you can press '0' to get sum");
    n = in.nextInt();
}
        System.out.println("Sum of entered numbers is : " + sum);
    }


}
