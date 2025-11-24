package Heap;
import java.util.*;

class MinHeap {

    int[] arr;
    int size;

    MinHeap(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    void insert(int val) {
        arr[size] = val;
        int i = size;
        size++;
        while (i > 0 && arr[(i - 1) / 2] > arr[i]) {
            int t = arr[i];
            arr[i] = arr[(i - 1) / 2];
            arr[(i - 1) / 2] = t;
            i = (i - 1) / 2;
        }
    }

    boolean search(int val) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == val) return true;
        }
        return false;
    }

    void delete(int val) {
        int i = -1;
        for (int j = 0; j < size; j++) {
            if (arr[j] == val) {
                i = j;
                break;
            }
        }
        if (i == -1) return;

        arr[i] = arr[size - 1];
        size--;

        int p = i;
        while (p > 0 && arr[(p - 1) / 2] > arr[p]) {
            int t = arr[p];
            arr[p] = arr[(p - 1) / 2];
            arr[(p - 1) / 2] = t;
            p = (p - 1) / 2;
        }

        heapifyDown(i);
    }

    void heapifyDown(int i) {
        while (true) {
            int l = 2 * i + 1;
            int r = 2 * i + 2;
            int s = i;

            if (l < size && arr[l] < arr[s]) s = l;
            if (r < size && arr[r] < arr[s]) s = r;

            if (s != i) {
                int t = arr[i];
                arr[i] = arr[s];
                arr[s] = t;
                i = s;
            } else break;
        }
    }

    boolean isHeap() {
        for (int i = 0; i < size; i++) {
            int l = 2 * i + 1;
            int r = 2 * i + 2;
            if (l < size && arr[i] > arr[l]) return false;
            if (r < size && arr[i] > arr[r]) return false;
        }
        return true;
    }

    void print() {
        for (int i = 0; i < size; i++) System.out.print(arr[i] + " ");
        System.out.println();
    }
}

class MaxHeap {
    int[] arr;
    int size;

    MaxHeap(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    void insert(int val) {
        arr[size] = val;
        int i = size;
        size++;
        while (i > 0 && arr[(i - 1) / 2] < arr[i]) {
            int t = arr[i];
            arr[i] = arr[(i - 1) / 2];
            arr[(i - 1) / 2] = t;
            i = (i - 1) / 2;
        }
    }

    boolean search(int val) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == val) return true;
        }
        return false;
    }

    void delete(int val) {
        int i = -1;
        for (int j = 0; j < size; j++) {
            if (arr[j] == val) {
                i = j;
                break;
            }
        }
        if (i == -1) return;

        arr[i] = arr[size - 1];
        size--;

        int p = i;
        while (p > 0 && arr[(p - 1) / 2] < arr[p]) {
            int t = arr[p];
            arr[p] = arr[(p - 1) / 2];
            arr[(p - 1) / 2] = t;
            p = (p - 1) / 2;
        }

        heapifyDown(i);
    }

    void heapifyDown(int i) {
        while (true) {
            int l = 2 * i + 1;
            int r = 2 * i + 2;
            int s = i;

            if (l < size && arr[l] > arr[s]) s = l;
            if (r < size && arr[r] > arr[s]) s = r;

            if (s != i) {
                int t = arr[i];
                arr[i] = arr[s];
                arr[s] = t;
                i = s;
            } else break;
        }
    }

    boolean isHeap() {
        for (int i = 0; i < size; i++) {
            int l = 2 * i + 1;
            int r = 2 * i + 2;
            if (l < size && arr[i] < arr[l]) return false;
            if (r < size && arr[i] < arr[r]) return false;
        }
        return true;
    }

    void print() {
        for (int i = 0; i < size; i++) System.out.print(arr[i] + " ");
        System.out.println();
    }
}

public class HeapLab {
    public static void main(String[] args) {
        MinHeap min = new MinHeap(50);
        MaxHeap max = new MaxHeap(50);

        min.insert(5);
        min.insert(3);
        min.insert(8);

        max.insert(5);
        max.insert(3);
        max.insert(8);

        min.print();
        max.print();

        min.delete(3);
        max.delete(8);

        min.print();
        max.print();

        System.out.println(min.isHeap());
        System.out.println(max.isHeap());
    }
}
