package Heap;
import java.util.Arrays;

public class HeapImplementation {

    public static void main(String[] args) {
        System.out.println("=== Testing Min Heap ===");
        Heap minHeap = new Heap(10, true);

        int[] minData = {10, 5, 30, 2, 8, 15};
        System.out.println("Inserting: " + Arrays.toString(minData));
        for (int val : minData) {
            minHeap.insert(val);
        }

        minHeap.print();

        System.out.println("Searching for 8: " + (minHeap.search(8) ? "Found" : "Not Found"));
        System.out.println("Searching for 99: " + (minHeap.search(99) ? "Found" : "Not Found"));

        System.out.println("Extracted root: " + minHeap.extract());
        minHeap.print();

        System.out.println("\n------------------------\n");

        System.out.println("=== Testing Max Heap ===");
        Heap maxHeap = new Heap(10, false);

        int[] maxData = {10, 5, 30, 2, 8, 15};
        System.out.println("Inserting: " + Arrays.toString(maxData));
        for (int val : maxData) {
            maxHeap.insert(val);
        }

        maxHeap.print();

        System.out.println("Searching for 30: " + (maxHeap.search(30) ? "Found" : "Not Found"));

        System.out.println("Extracted root: " + maxHeap.extract());
        maxHeap.print();
    }

    static class Heap {
        private int[] heap;
        private int size;
        private int capacity;
        private boolean isMinHeap;

        public Heap(int capacity, boolean isMinHeap) {
            this.capacity = capacity;
            this.isMinHeap = isMinHeap;
            this.size = 0;
            this.heap = new int[capacity];
        }

        public void insert(int value) {
            if (size == capacity) {
                System.out.println("Heap is full, resizing...");
                heap = Arrays.copyOf(heap, capacity * 2);
                capacity *= 2;
            }

            heap[size] = value;
            size++;

            heapifyUp(size - 1);
        }

        public boolean search(int value) {
            for (int i = 0; i < size; i++) {
                if (heap[i] == value) {
                    return true;
                }
            }
            return false;
        }

        public void print() {
            if (size == 0) {
                System.out.println("Heap is empty.");
                return;
            }

            System.out.print("Heap Array: [");
            for (int i = 0; i < size; i++) {
                System.out.print(heap[i] + (i < size - 1 ? ", " : ""));
            }
            System.out.println("]");

            printTree(0, "");
        }

        private void printTree(int index, String indent) {
            if (index >= size) return;

            System.out.println(indent + heap[index]);

            int left = getLeftChildIndex(index);
            int right = getRightChildIndex(index);

            if (left < size || right < size) {
                if (left < size) printTree(left, indent + "  L: ");
                else System.out.println(indent + "  L: -");

                if (right < size) printTree(right, indent + "  R: ");
                else System.out.println(indent + "  R: -");
            }
        }

        public int extract() {
            if (size == 0) throw new IllegalStateException("Heap is empty");

            int root = heap[0];

            heap[0] = heap[size - 1];
            size--;

            heapifyDown(0);

            return root;
        }


        private void heapifyUp(int index) {
            int parentIndex = getParentIndex(index);

            while (index > 0 && compare(heap[index], heap[parentIndex])) {
                swap(index, parentIndex);
                index = parentIndex;
                parentIndex = getParentIndex(index);
            }
        }

        private void heapifyDown(int index) {
            while (hasLeftChild(index)) {
                int smallerChildIndex = getLeftChildIndex(index);

                if (hasRightChild(index) && compare(heap[getRightChildIndex(index)], heap[smallerChildIndex])) {
                    smallerChildIndex = getRightChildIndex(index);
                }

                if (compare(heap[index], heap[smallerChildIndex])) {
                    break;
                } else {
                    swap(index, smallerChildIndex);
                }

                index = smallerChildIndex;
            }
        }

        private boolean compare(int childValue, int parentValue) {
            if (isMinHeap) {
                return childValue < parentValue;
            } else {
                return childValue > parentValue;
            }
        }

        private int getParentIndex(int i) { return (i - 1) / 2; }
        private int getLeftChildIndex(int i) { return 2 * i + 1; }
        private int getRightChildIndex(int i) { return 2 * i + 2; }

        private boolean hasLeftChild(int i) { return getLeftChildIndex(i) < size; }
        private boolean hasRightChild(int i) { return getRightChildIndex(i) < size; }

        private void swap(int index1, int index2) {
            int temp = heap[index1];
            heap[index1] = heap[index2];
            heap[index2] = temp;
        }
    }
}