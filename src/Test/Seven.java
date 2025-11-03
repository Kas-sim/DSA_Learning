package Test;

public class Seven {
    public static void main(String[] args) {
        int[][] array = {
                {3, 8, 5},
                {7, 4, 9},
                {2, 1, 6}
        };

        System.out.println("\nArray values are: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        boolean isColumnMagic = true;
        int expectedSum = 0;
        for (int i = 0; i < array.length; i++) {
            expectedSum += array[i][0];
        }
        for (int col = 1; col < array[0].length; col++) {
            int colSum = 0;
            for (int row = 0; row < array.length; row++) {
                colSum += array[row][col];
            }
            if (colSum != expectedSum) {
                isColumnMagic = false;
                break;
            }
        }
        if (isColumnMagic) {
            System.out.println("\nThe array is Column-Magic\n");
        } else {
            System.out.println("\nThe array is not Column-Magic\n");
        }
    }
}
