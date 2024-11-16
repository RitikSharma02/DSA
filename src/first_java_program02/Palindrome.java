package first_java_program02;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println("Enter your String");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String ordered = str;
        String unordered = "";


        for (int i = str.length()-1; i >=0 ; i--) {
            unordered += str.charAt(i);
        }
        if(ordered.length()== unordered.length() && ordered.equalsIgnoreCase(unordered)){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }
    }
}
