package Test;
import java.util.Scanner;

public class mergerUnsorted {
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.println("\nEnter size and elements of first Array: ");
    int size1 = scn.nextInt();
    int[] arr1 = new int[size1];
    for (int i = 0; i < size1; i++) {
        arr1[i] = scn.nextInt();
    }

    System.out.println("\nEnter size and elements of second Array: ");
    int size2 = scn.nextInt();
    int[] arr2 = new int[size2];
    for (int i = 0; i < size2; i++) {
        arr2[i] = scn.nextInt();
    }

    for (int x : arr1) {
        System.out.println(x);
    }
    for (int x : arr2) {
        System.out.println(x);
    }

//    int size3 = size1 + size2;
    int[] arr3 = new int[arr1.length + arr2.length];

    int i = 0;

    while(i < arr3.length) {

        if (i < size1) {
            arr3[i] = arr1[i];
        } else {
            arr3[i] = arr2[i - size1];
        }

    }



    for (int x : arr3) {
        System.out.print(x + " ");
    }




}
}

