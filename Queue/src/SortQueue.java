import java.util.LinkedList;
import java.util.Queue;

public class SortQueue {
    public static void sortQueue(Queue<Integer> q) {
        int n = q.size();

        for (int i = 1; i <= n; i++) {
            int minIndex = getMinIndex(q, n - i);
            insertMinToRear(q, minIndex);
        }
    }

    private static int getMinIndex(Queue<Integer> q, int sortedIndex) {
        int minIndex = -1;
        int minValue = Integer.MAX_VALUE;
        int n = q.size();

        for (int i = 0; i < n; i++) {
            int curr = q.remove();

            if (curr < minValue && i <= sortedIndex) {
                minValue = curr;
                minIndex = i;
            }

            q.add(curr);
        }

        return minIndex;
    }

    private static void insertMinToRear(Queue<Integer> q, int minIndex) {
        int minValue = 0;
        int n = q.size();

        for (int i = 0; i < n; i++) {
            int curr = q.remove();

            if (i == minIndex) {
                minValue = curr;
            } else {
                q.add(curr);
            }
        }

        q.add(minValue);
    }

    public static void printQueue(Queue<Integer> q) {
        System.out.print("Queue (front → rear): ");
        for (int val : q) {
            System.out.print("[ " + val + " ] ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(30);
        q.add(11);
        q.add(15);
        q.add(4);

        System.out.println("Original Queue:");
        printQueue(q);

        sortQueue(q);

        System.out.println("Sorted Queue:");
        printQueue(q);
    }
}
