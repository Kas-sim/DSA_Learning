public class DoublyList4 {
    Node head, tail;

    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    void insertAtBeginning(int data) {
        Node NN = new Node(data);
        if (head == null) {
            head = tail = NN;
            tail.next = head;
        } else {
            NN.next = head;
            head = NN;
            tail.next = head;
        }
    }

    void insertAtEnd(int data) {
        Node NN = new Node(data);
        if (head == null) {
            head = tail = NN;
            tail.next = head;
        } else {
            tail.next = NN;
            tail = NN;
            tail.next = head;
        }
    }

    void deleteFromBeginning() {
        if (head == null) return;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }
    }

    void deleteFromEnd() {
        if (head == null) return;
        if (head == tail) {
            head = tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = head;
            tail = temp;
        }
    }

    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    boolean hasCycle() {
        if (head == null) return false;
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        DoublyList4 list = new DoublyList4();

        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);

        System.out.println("List elements: ");
        list.display();

        System.out.println("Has cycle? " + list.hasCycle());

        list.tail.next = list.head.next;

        System.out.println("Has cycle after creating a loop? " + list.hasCycle());


        System.out.println("\nDsa Lab 3 by Qasim");
    }
}
