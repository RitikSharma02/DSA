package flow_of_program_01;

import java.util.Scanner;

public class hcf_lcm {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = in.nextInt();
        System.out.println("Enter Second number");
        int b = in.nextInt();
        int hcf = calculateHCF(a, b);

        // H.C.F is
        System.out.println( "H.C.F is " + hcf);
        // L.C.M is
        int lcm = (a*b)/hcf;
        System.out.println("L.C.M is " + lcm );

    }
    public static int calculateHCF(int a, int b){
        while( b != 0 ){
             int temp = b;
              b = a % b;
              a = temp;
             }
        return a;
    }

}
