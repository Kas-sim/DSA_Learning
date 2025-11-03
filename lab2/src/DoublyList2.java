public class DoublyList2 {
    Node head;
    Node tail;

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int d) {
            this.data = d;
            this.prev = null;
            this.next = null;
        }
    }

    void addToBack(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    int removeBackItem() {
        if (tail == null) {
            return -1; // list is empty
        }
        int val = tail.data;
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        } else {
            head = null;
        }
        return val;
    }

    void printInReverseOrder() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyList2 list = new DoublyList2();

        list.addToBack(10);
        list.addToBack(20);
        list.addToBack(30);

        System.out.println("Forward list:");
        list.printList();

        System.out.println("Reverse list:");
        list.printInReverseOrder();

        System.out.println("Removed back: " + list.removeBackItem());
        list.printList();

        System.out.println("Removed back: " + list.removeBackItem());
        list.printList();

        System.out.println("Removed back: " + list.removeBackItem());
        list.printList();

        System.out.println("Removed back (empty): " + list.removeBackItem());
    }
}
