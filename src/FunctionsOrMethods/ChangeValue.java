package FunctionsOrMethods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3, 4};
        change(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    static void change(int[] nums){
        nums[0]=99;
    }

}


