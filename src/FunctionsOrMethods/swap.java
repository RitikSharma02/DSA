package FunctionsOrMethods;

public class swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        swap(a, b);

        System.out.println(a + " " + b);


    }
    static void swap(int a, int b){
        int temp = a;
        b = a;
        b = temp;
    }

}


//The issue lies in how Java handles method arguments.
// Java passes arguments by value, not by reference. This means that when you call the swap() method
// and pass the variables a and b, the method receives copies of the values of a and b, not the actual variables themselves.

//So, any changes made to a and b inside the swap() method only affect the copies, not the original variables in the main() method.

//        Here’s the problem:


//You swap the values of the copied variables inside the method,
// but that has no effect on the original a and b in the main() method.
//After returning from swap(), a and b in the main() remain unchanged.