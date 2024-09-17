package Switch_statements;

import java.util.Scanner;

public class nested_switch {


    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("enter an integer");

        int number = input.nextInt();
        String department  = input.next();

        switch (number){
            case 1 :
                System.out.println("ritwikk");
        break;
            case 2 :
                System.out.println("shamrrra  ");
                break;
            case 3 :
                System.out.println("3 typedd yayay");
                switch(department){
                    case "it" :
                        System.out.println("bro wanna be a faaaaaaaaanggggggg");
                        break;
                    case"ai":
                        System.out.println("departrment f 2 ");
                    default:
                        System.out.println("aint no department for number 1 2 ");
                }
            default:
                System.out.println("naah you sjkfjbss");
                break;
        }




    }
}
