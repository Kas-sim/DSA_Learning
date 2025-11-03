package Test;


public class Nine {
    public static void main(String[] args) {

        int[][] arr = {
                {3, 7, 2},
                {8, 4, 1},
                {5, 9, 6}
        };

        System.out.println("\nOriginal array values are:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nVertically flipped array is");
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
