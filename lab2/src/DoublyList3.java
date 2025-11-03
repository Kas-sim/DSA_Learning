public class DoublyList3 {
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

    public static void main(String[] args) {
        DoublyList3 list = new DoublyList3();

        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        System.out.print("List after insertions: ");
        list.display();

        list.deleteFromBeginning();
        System.out.print("List after deleting from beginning: ");
        list.display();

        list.deleteFromEnd();
        System.out.print("List after deleting from end: ");
        list.display();
        System.out.println("\nDsa Lab 3 by Qasim");
    }
}
