package Test;
public class Five {
    public static void main(String[] args) {
        int[] array = {21, 9, 17, 9, 21, 9};

        System.out.print("Array values are: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        boolean[] visited = new boolean[array.length];
        System.out.println("The frequency of all elements of the array are:");
        for (int i = 0; i < array.length; i++) {
            if (visited[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(array[i] + " occurs " + count + " times");
        }
    }
}
