package Conditional_loops;

import java.util.Scanner;
// to check if input char is lowercase or uppercase
public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character");
        char ch = sc.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("LowerCase");
        }
      else {
            System.out.println("Uppercase");
        }

    }



}
