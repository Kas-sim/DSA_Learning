package Sorting;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void insertionSort() {
        if (head == null || head.next == null)
            return;

        Node sorted = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            sorted = insertInSortedOrder(sorted, current);
            current = next;
        }

        head = sorted;
    }

    Node insertInSortedOrder(Node sorted, Node newNode) {
        if (sorted == null || newNode.data < sorted.data) {
            newNode.next = sorted;
            sorted = newNode;
        } else {
            Node temp = sorted;
            while (temp.next != null && temp.next.data < newNode.data) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        return sorted;
    }
}

public class SortLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(4);
        list.insert(2);
        list.insert(5);
        list.insert(3);
        list.insert(1);

        System.out.println("=== BEFORE SORTING ===");
        list.printList();

        list.insertionSort();

        System.out.println("=== AFTER SORTING (Insertion Sort) ===");
        list.printList();
    }
}
