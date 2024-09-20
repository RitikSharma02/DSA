package FunctionsOrMethods;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.print("Enter your Number : ");
//        int digit = in.nextInt();


        for (int i = 100; i < 999; i++) {
            if(isArmstrong(i)){
                System.out.println(i + " ");
            }
        }
    }



    static boolean isArmstrong(int digit){
        int original = digit;
        int sum=0;
        while (digit>0){
            int rem = digit % 10;
             sum = sum + (rem*rem*rem);
             digit = digit/10;
        }
        return sum == original;
    }


}
