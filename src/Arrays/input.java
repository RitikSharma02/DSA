package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class input {


    int a = 19;

    String Name = "ritik";
    int[] ros = new int[5];



//    to store 5 roll no
// syntax
// dataType[] variable_name = new dataType[size];

    // to store many rol nos
//    int[] rollno = new int[10];
//    or
//
//    int[] rolln = {12, 12, 14};

    public static void main(String[] args) {

//        int[] ros;
//       ros =  new int[5];
//       System.out.println(ros[1]);
//
//       String[] arr = new String[6];
//
//        System.out.println(arr[1]);

//        int [] arr = new int[5];
//        Scanner in = new Scanner(System.in);
//        arr[2] =5;
//        arr[1] =3;
//        System.out.println(arr[2]);


//        for (int i =0; i<arr.length; i++){
//            arr[i]= in.nextInt();
//        }
//
//        for (int i =0; i<arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }

//        System.out.println(Arrays.toString(arr));


        /// array of objects

        String[] str = new String[5];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < str.length; i++) {

            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

    }
}
