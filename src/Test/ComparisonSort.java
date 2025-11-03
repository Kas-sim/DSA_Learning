package Test;

public class ComparisonSort {

    public static void comparisonCountingSort(int[] A) {
        int n = A.length;
        int[] Count = new int[n];
        int[] S = new int[n];

        for (int i = 0; i < n; i++) {
            Count[i] = 0;
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (A[i] < A[j]) {
                    Count[j] = Count[j] + 1;
                } else {
                    Count[i] = Count[i] + 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            S[Count[i]] = A[i];
        }

        for (int i = 0; i < n; i++) {
            A[i] = S[i];
        }
    }

    public static void main(String[] args) {
        int[] A = {56, 34, 78, 4, 67, 1};

        System.out.println("Original Array:");
        for (int num : A) {
            System.out.print(num + " ");
        }
        System.out.println();

        comparisonCountingSort(A);

        System.out.println("Sorted Array:");
        for (int num : A) {
            System.out.print(num + " ");
        }
    }
}
