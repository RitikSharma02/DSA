package flow_of_program_01;

import java.util.Scanner;

public class leapYear {


    public static void main(String[] args) {


        while (true){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the year : ");
            int year = in.nextInt();
        if(year % 4 ==0){
            if(year % 100 == 0 ){
               if(year % 400 ==0 ){
                   System.out.println(year + " is a leap year");
               }
               else {
                   System.out.println( year + " is not a leap year");
               }
            }
            else {
                System.out.println(year + " is a leap year");
            }
        }
        else {
            System.out.println(year + " is not a leap year");
        }




        }








    }




}
