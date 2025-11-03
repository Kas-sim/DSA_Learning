public class StackDynamicArray {

    private int[] arr;
    private int top;
    private int capacity;

    public StackDynamicArray(int initialCapacity) {
        this.capacity = initialCapacity;
        this.arr = new int[capacity];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int val) {
        if (top == capacity - 1) {
            resize();
        }
        arr[++top] = val;
        System.out.println(val + " pushed");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return arr[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return -1;
        }
        return arr[top];
    }

    public int getSize() {
        return top + 1;
    }

    private void resize() {
        capacity = capacity * 2;
        int[] newArr = new int[capacity];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        arr = newArr;
        System.out.println("Stack resized to capacity: " + capacity);
    }

    public void printAll() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.println("Element " + (i + 1) + ": " + arr[i]);
        }
    }

    public static void main(String[] args) {
        StackDynamicArray stk = new StackDynamicArray(3); // start with small capacity

        System.out.println("Is Empty? " + stk.isEmpty());
        System.out.println("Size: " + stk.getSize());

        stk.push(10);
        stk.push(20);
        stk.push(30);

        stk.push(40);
        stk.push(50);

        System.out.println("\nTop Element: " + stk.peek());
        System.out.println("Stack Size: " + stk.getSize());

        System.out.println("\nPrinting Stack:");
        stk.printAll();

        System.out.println("\nPopped: " + stk.pop());
        System.out.println("New Top: " + stk.peek());
        System.out.println("Size after Pop: " + stk.getSize());

        System.out.println("\nPrinting Stack after Pop:");
        stk.printAll();
    }
}
