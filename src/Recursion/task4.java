package Recursion;

public class task4 {

    static int[] stack = new int[10];
    static int top = -1;

    public static void push(int x) {
        stack[++top] = x;
    }

    public static int pop() {
        return stack[top--];
    }

    public static boolean isEmpty() {
        return top == -1;
    }

    public static void insertAtBottom(int x) {
        if (isEmpty()) {
            push(x);
            return;
        }
        int temp = pop();
        insertAtBottom(x);
        push(temp);
    }

    public static void reverse() {
        if (isEmpty())
            return;
        int temp = pop();
        reverse();
        insertAtBottom(temp);
    }

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);

        System.out.print("Original Stack: ");
        for (int i = 0; i <= top; i++)
            System.out.print(stack[i] + " ");

        reverse();

        System.out.print("\nReversed Stack: ");
        for (int i = 0; i <= top; i++)
            System.out.print(stack[i] + " ");
    }
}
