package FunctionsOrMethods;
import java.util.Scanner;

public class basic {

    public static void main(String[] args) {
//      int ans=   sum2(90, 2);
//        System.out.println(ans);
        System.out.println("enter your name");
        Scanner in = new Scanner(System.in);
        String name = in.next();
      String personalized =  greet(name);
        System.out.println(personalized);
    }

    static String greet(String name ){
        return "hello " + name;
    }




//static int sum2(int a, int b){
//        int sum = a+b;
//        return sum;
//}
//    static void sum () {
//        Scanner input = new Scanner(System.in);
//        System.out.println("enter first number");
//     int num1 = input.nextInt();
//        System.out.println("enter second number");
//        int num2 = input.nextInt();
//        int sum = num1+num2;
//        System.out.println("Sum of two numbers is : "+ sum);
//
//    }
}
