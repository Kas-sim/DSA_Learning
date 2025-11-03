package Sorting;

public class SortComparison {
    public static void main(String[] args) {
        int[] normal = {5, 2, 9, 1, 5, 6};
        int[] descending = {9, 8, 7, 6, 5, 4};
        int[] almostSorted = {1, 2, 3, 5, 4, 6};

        System.out.println("=== NORMAL ARRAY ===");
        runAll(normal);

        System.out.println("\n=== DESCENDING ARRAY ===");
        runAll(descending);

        System.out.println("\n=== ALMOST SORTED ARRAY ===");
        runAll(almostSorted);
    }

    public static void runAll(int[] arr) {
        bubbleSort(arr.clone());
        selectionSort(arr.clone());
        insertionSort(arr.clone());
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int comparisons = 0;
        int swaps = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                comparisons++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
        }

        System.out.println("Bubble Sort → Comparisons: " + comparisons + ", Swaps: " + swaps);
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        int comparisons = 0;
        int swaps = 0;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                comparisons++;
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                swaps++;
            }
        }

        System.out.println("Selection Sort → Comparisons: " + comparisons + ", Swaps: " + swaps);
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        int comparisons = 0;
        int swaps = 0;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0) {
                comparisons++;
                if (arr[j] > key) {
                    arr[j + 1] = arr[j];
                    swaps++;
                    j--;
                } else {
                    break;
                }
            }
            arr[j + 1] = key;
        }

        System.out.println("Insertion Sort → Comparisons: " + comparisons + ", Swaps: " + swaps);
    }
}
