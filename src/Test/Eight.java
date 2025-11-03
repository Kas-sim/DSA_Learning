package Test;
public class Eight {
    public static void main(String[] args) {
        int[][] arr = {
                {3, 7, 2},
                {8, 4, 1},
                {5, 9, 6}
        };

        System.out.println("Original array values are:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            int left = 0;
            int right = arr[i].length - 1;
            while (left < right) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }
        System.out.println("Horizontally flipped array is:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
