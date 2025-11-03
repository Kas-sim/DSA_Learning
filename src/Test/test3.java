package Test;

public class test3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        int[] merged = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        for (; i < arr1.length && j < arr2.length; k++) {
            if (arr1[i] < arr2[j]) {
                merged[k] = arr1[i];
                i++;
            } else {
                merged[k] = arr2[j];
                j++;
            }
        }

        for (; i < arr1.length; i++, k++) merged[k] = arr1[i];
        for (; j < arr2.length; j++, k++) merged[k] = arr2[j];

        for (int num : merged) System.out.print(num + " ");
    }
}
