package first_java_program_02;

import java.util.Scanner;

public class calculate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First number : ");
        int num1 = in.nextInt();
        System.out.println("Enter Second number : ");
        int num2 = in.nextInt();
        System.out.println("Enter the operator from these : '+' '-' '*' '/' ");
       String str = in.next();
       int solution = 0;

       if(str.equals("+")){
          solution =  num1+num2;
       }
      else if(str.equals("-")){
           solution = num1-num2;
       }  else if(str.equals("*")){
           solution = num1-num2;
       }  else if(str.equals("/")){
          if (num2!=0){
              solution = num1-num2;

          }else {
              System.out.println("Can not divide by zero");
              return;
          }

       }
      else {
           System.out.println("Invalid operator");
       }
        System.out.println("Solution is : " + solution);
    }
}
