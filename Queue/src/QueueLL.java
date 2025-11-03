public class QueueLL {
    private static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    private Node front, rear;
    private int size;

    QueueLL() {
        front = rear = null;
        size = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void enQ(int data) {
        Node newNode = new Node(data);
        if (rear == null) { // empty queue
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    int deQ() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return -1;
        }
        int removed = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return removed;
    }

    int getFront() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return -1;
        }
        return front.data;
    }

    int getSize() {
        return size;
    }

    void printAll() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return;
        }
        System.out.print("Queue (front → rear): ");
        Node temp = front;
        while (temp != null) {
            System.out.print("[ " + temp.data + " ] ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueLL q = new QueueLL();

        q.enQ(10);
        q.enQ(20);
        q.enQ(30);

        q.printAll();

        System.out.println("Dequeued: " + q.deQ());
        q.printAll();

        System.out.println("Front element: " + q.getFront());
        System.out.println("Size: " + q.getSize());
        System.out.println("Is Empty? " + q.isEmpty());

        q.deQ();
        q.deQ();
        q.printAll();
        System.out.println("Dequeued from empty: " + q.deQ());
    }
}
