public class Queue {
    int capacity;
    int end;
    int[] Q;
    int size;
    int front;

    Queue(int d) {
        this.capacity = d;
        this.size = 0;
        Q = new int[capacity];
        this.end = -1;
        this.front = 0;
    }

    boolean isFull() {
        return size == capacity;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void enQ(int data) {
        if (isFull()) {
            System.out.println("Queue is Full!");
            return;
        }
        end = (end + 1) % capacity;
        Q[end] = data;
        size++;
    }

    int deQ() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return -1;
        }
        int removed = Q[front];
        front = (front + 1) % capacity;
        size--;

        if (size == 0) {
            // reset for fresh start
            front = 0;
            end = -1;
        }
        return removed;
    }

    int getFront() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return -1;
        }
        return Q[front];
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
        for (int i = 0; i < size; i++) {
            System.out.print("[ " + Q[(front + i) % capacity] + " ] ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue q1 = new Queue(3);

        q1.enQ(5);
        q1.enQ(70);
        q1.enQ(69);

        q1.printAll();

        System.out.println("Dequeued: " + q1.deQ());
        q1.enQ(80);

        q1.printAll();

        System.out.println("Front element: " + q1.getFront());
        System.out.println("Size: " + q1.getSize());
        System.out.println("Is Empty? " + q1.isEmpty());
        System.out.println("Is Full? " + q1.isFull());
    }
}
/*public class Queue {
    int capacity;
    int end;
    int[] Q;
    int size;
    int front;

    Queue(int d) {
        this.capacity = d;
        this.size = 0;
        Q = new int[capacity];
        this.end = -1;
        this.front = 0;
    }

    Boolean isFull() { return size == capacity; }
    Boolean isEmpty() { return size == 0; }

    void enQ(int data) {
        if(isFull()) {
            System.out.println("Queue is Full ");
            return;
        } else {
            end = (end+1) % capacity;
            Q[end] = data;
            size++;
        }
    }

    void deQ() {
        if(isEmpty()) {
            return;
        } else {
            int a = Q[front];
            front = (front+1) % capacity;
            size--;

            if (size == 0) {
                front = 0;
                end = -1;
            }

        }
    }

    int getFront() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return -1;
        }
        else {
            return Q[front];
        }
    }

    boolean getSize() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
        } else if (isFull()) {
            System.out.println("Queue is Full");
        } else {
           System.out.println("The size is: " + size);
        }
        return false;
    }

    void display() {
        for (int i = 0; i < size; i++) {
            System.out.print("[ "+Q[(front+i) % capacity]+" ] -> ");
        }
    }

    public static void main(String[] args) {
        Queue q1 = new Queue(3);
        q1.enQ(5);
        q1.enQ(70);
        q1.enQ(69);

        q1.display();
        q1.deQ();
        q1.enQ(80);

        System.out.println(q1.getSize());
        System.out.println(q1.isEmpty());
        System.out.println(q1.isFull());

        q1.display();
    }

}*/
