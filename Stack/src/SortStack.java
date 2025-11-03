import java.util.Stack;

public class SortStack {

    public static Stack<Integer> sortStack(Stack<Integer> input) {
        Stack<Integer> tempStack = new Stack<>();

        while (!input.isEmpty()) {
            int curr = input.pop();

            while (!tempStack.isEmpty() && tempStack.peek() > curr) {
                input.push(tempStack.pop());
            }

            tempStack.push(curr);
        }
        return tempStack;
    }

    public static void printStack(Stack<Integer> stack) {
        Stack<Integer> temp = new Stack<>();
        while (!stack.isEmpty()) {
            int val = stack.pop();
            System.out.println(val);
            temp.push(val);
        }
        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        stack.push(23);

        System.out.println("Original Stack:");
        printStack(stack);

        Stack<Integer> sorted = sortStack(stack);

        System.out.println("\nSorted Stack (smallest on top):");
        printStack(sorted);
    }
}
