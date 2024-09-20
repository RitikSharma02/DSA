import java.util.Scanner;

public class REverse {

    public static void main(String[] args) {
        System.out.print("enter the size of first array : ");
    Scanner input = new Scanner(System.in);
    int size1 = input.nextInt();
    int [] arr1 = new int[size1];
        System.out.print("enter the elements of first array : ");
        for (int i = 0; i < size1; i++) {
            arr1[i]= input.nextInt();
        }
        System.out.print("enter the size of second array : ");
        int size2 = input.nextInt();
        int [] arr2 = new int[size2];
        System.out.print("enter the elements of second array : ");
        for (int j = 0; j < size2; j++) {
            arr2[j]= input.nextInt();
        }
        System.out.println("common elements are : ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j]){
                    System.out.print(arr1[i] + " ");
                    break;
                }

            }

        }
    }
}
