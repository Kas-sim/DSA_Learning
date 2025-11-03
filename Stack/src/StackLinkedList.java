public class StackLinkedList {

    private class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    private Node top;
    private int size;

    StackLinkedList() {
        this.top = null;
        this.size = 0;
    }

    boolean isEmpty() {
        return top == null;
    }

    void push(int val) {
        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;
        size++;
        System.out.println(val + " pushed");
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        int popped = top.data;
        top = top.next;
        size--;
        return popped;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return -1;
        }
        return top.data;
    }

    int getSize() {
        return size;
    }

    void printAll() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return;
        }
        Node curr = top;
        int index = size;
        while (curr != null) {
            System.out.println("Element " + index + ": " + curr.data);
            curr = curr.next;
            index--;
        }
    }

    public static void main(String[] args) {

        StackLinkedList stk = new StackLinkedList();

        System.out.println("Is Empty? " + stk.isEmpty());
        System.out.println("Size: " + stk.getSize());

        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);

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
