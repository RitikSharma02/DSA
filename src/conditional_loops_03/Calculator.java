package conditional_loops_03;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // take input from user
        int ans = 0;

        while(true){
            // take operator as input
            System.out.print("Enter the operator : ");
            char op = in.next().trim().charAt(0);

            if(op == '-' || op == '+' || op == '*' || op =='/' || op == '%'){
                System.out.print("Enter two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                System.out.println();
            if(op == '+'){
               ans = num1+num2;
            }
                if(op == '-'){
                  ans  = (num1-num2);
                }
                if(op == '*'){
                    ans = (num1*num2);
                }
                if(op == '/'){
                    if(num2!=0){
                        ans = (num1/num2);
                    }

                }
                if(op == '%'){
                    ans = (num1%num2);
                }
            }

            else if (op == 'x'|| op =='X') {
               break;
            }
           else {
                System.out.println("Invalid operation !! ");
            }
            System.out.println(ans);
        }
    }
}