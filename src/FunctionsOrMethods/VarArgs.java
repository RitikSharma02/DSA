package FunctionsOrMethods;
/// variable length arguments

import java.util.Arrays;
import java.util.Scanner;

public class VarArgs {

    public static void main(String[] args) {
//        yay(1,3,3,432,432,4,43,24,2,3,4,3,434,23,423,4,34,23,4,23,4,23,42);

        yay2(10,78, "hello", "ritwikkkk", "how", "are", "u");
        Scanner input = new Scanner(System.in);
        String str = input.next();

    }
    static void yay (int ...v){
        System.out.println(Arrays.toString(v));
    }



    static void yay2(int a, int b, String ...v){
        System.out.print( a + " " + b + Arrays.toString(v));
    }

}
