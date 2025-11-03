import java.util.Scanner;

public class copiedReverse {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);

            System.out.print("Enter size of array: ");
            int size = scn.nextInt();
            int[] arr = new int[size];

            for (int i = 0; i < size; i++) {
                arr[i] = scn.nextInt();
            }
            System.out.println("Your Array: ");
            for (int nums : arr) {
                System.out.print(nums);
            }

            int[] arr2 = new int[size];
            for (int i = 0, j = size -1; i < size; i++, j--) {
                arr2[i] = arr[j];
            }
            System.out.println("\n Outputted Array: ");
            for (int nums : arr2) {
                System.out.print(nums);
            }


        }
}
