package Sorting;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr1 = {5, 2, 9, 1, 7};
        int[] arr2 = {8, 3, 6, 4, 0};

        System.out.print("Array 1: ");
        printArray(arr1);

        System.out.print("Array 2: ");
        printArray(arr2);

        int[] merged = mergeArrays(arr1, arr2);

        System.out.print("Merged (Unsorted): ");
        printArray(merged);

        bubbleSort(merged);

        System.out.print("Merged & Sorted: ");
        printArray(merged);
    }

    public static int[] mergeArrays(int[] a, int[] b) {
        int[] merged = new int[a.length + b.length];
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            merged[index] = a[i];
            index++;
        }

        for (int i = 0; i < b.length; i++) {
            merged[index] = b[i];
            index++;
        }

        return merged;
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
