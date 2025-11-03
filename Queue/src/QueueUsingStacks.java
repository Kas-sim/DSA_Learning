import java.util.Stack;

public class QueueUsingStacks {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public QueueUsingStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enQ(int data) {
        stack1.push(data);
    }

    public int deQ() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return -1;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    public int getFront() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return -1;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.peek();
    }

    public int getSize() {
        return stack1.size() + stack2.size();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public void printAll() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return;
        }

        System.out.print("Queue (front → rear): ");

        for (int i = stack2.size() - 1; i >= 0; i--) {
            System.out.print("[ " + stack2.get(i) + " ] ");
        }

        for (int i = 0; i < stack1.size(); i++) {
            System.out.print("[ " + stack1.get(i) + " ] ");
        }

        System.out.println("stack2 (front side): " + stack2);
        System.out.println("stack1 (rear side): " + stack1);
    }

    public static void main(String[] args) {
        QueueUsingStacks q = new QueueUsingStacks();

        q.enQ(10);
        q.enQ(20);
        q.enQ(30);
        q.printAll();

        System.out.println("Dequeued: " + q.deQ());
        q.printAll();

        q.enQ(40);
        q.enQ(50);
        q.printAll();

        System.out.println("Front element: " + q.getFront());
        System.out.println("Size: " + q.getSize());
        System.out.println("Is Empty? " + q.isEmpty());
    }
}
