package FunctionsOrMethods;

import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
        fun(10, 20,30,23,232,56,5645,21243,12,8978,567,43563);
//        fun("raghav"," helloe", "samme", "here");
    }

    static void fun(int ...a ){
        System.out.println("first function integer one");
        System.out.println(Arrays.toString(a));
    }
    static void fun(String ...v){
        System.out.println("second array string one");
        System.out.println(Arrays.toString(v));
    }



}
