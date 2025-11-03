public class DoublyList {
    Node Head;

    public DoublyList() {
        Head = null;
    }

    class Node {
        int data;
        Node prev;
        Node next;

        public Node(int d) {
            this.data = d;
            this.prev = null;
            this.next = null;
        }
    }

    void addToFront(int data) {
        Node newNode = new Node(data);
        if (Head == null) {
            Head = newNode;
        } else {
            newNode.next = Head;
            Head.prev = newNode;
            Head = newNode;
        }
    }

    void addToBack(int data) {
        Node newNode = new Node(data);
        if (Head == null) {
            Head = newNode;
            return;
        }
        Node temp = Head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }


    int getFrontItem() {
        if (Head == null) {
            throw new IllegalStateException("List is empty");
        }
        return Head.data;
    }

    int getBackItem() {
        if (Head == null) {
            throw new IllegalStateException("List is empty");
        }
        Node temp = Head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.data;
    }

    int removeFrontItem() {
        if (Head == null) {
            throw new IllegalStateException("List is empty");
        }
        int removedData = Head.data;
        Head = Head.next;
        if (Head != null) {
            Head.prev = null;
        }
        return removedData;
    }

    int removeBackItem() {
        if (Head == null) {
            throw new IllegalStateException("List is empty");
        }
        if (Head.next == null) {
            int val = Head.data;
            Head = null;
            return val;
        }
        Node temp = Head;
        while (temp.next != null) {
            temp = temp.next;
        }
        int val = temp.data;
        temp.prev.next = null;
        return val;
    }
    boolean find(int key) {
        Node temp = Head;
        while (temp != null) {
            if (temp.data == key) return true;
            temp = temp.next;
        }
        return false;
    }

    void remove(int key) {
        if (Head == null) return;
        if (Head.data == key) {
            Head = Head.next;
            if (Head != null) Head.prev = null;
            return;
        }
        Node temp = Head;
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }
        if (temp != null) {
            if (temp.next != null) {
                temp.next.prev = temp.prev;
            }
            if (temp.prev != null) {
                temp.prev.next = temp.next;
            }
        }
    }

    boolean isListEmpty() {
        return Head == null;
    }

    void addKeyBeforeNode(int key, int target) {
        if (Head == null) return;
        Node temp = Head;
        while (temp != null && temp.data != target) {
            temp = temp.next;
        }
        if (temp != null) {
            Node newNode = new Node(key);
            newNode.next = temp;
            newNode.prev = temp.prev;
            if (temp.prev != null) {
                temp.prev.next = newNode;
            } else {
                Head = newNode;
            }
            temp.prev = newNode;
        }
    }

    void addKeyAfterNode(int key, int target) {
        Node temp = Head;
        while (temp != null && temp.data != target) {
            temp = temp.next;
        }
        if (temp != null) {
            Node newNode = new Node(key);
            newNode.next = temp.next;
            newNode.prev = temp;
            if (temp.next != null) {
                temp.next.prev = newNode;
            }
            temp.next = newNode;
        }
    }

    void printList() {
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    void printAll() {
        printList();
    }

    public static void main(String[] args) {
        DoublyList list = new DoublyList();

        list.addToFront(10);
        list.addToFront(20);
        list.addToBack(5);
        list.addToBack(1);

        System.out.println("Initial list:");
        list.printAll();

        System.out.println("Front item: " + list.getFrontItem());
        System.out.println("Back item: " + list.getBackItem());

        System.out.println("Removed front: " + list.removeFrontItem());
        list.printAll();

        System.out.println("Removed back: " + list.removeBackItem());
        list.printAll();

        System.out.println("Find 10? " + list.find(10));
        System.out.println("Find 99? " + list.find(99));

        list.remove(10);
        System.out.println("List after removing 10:");
        list.printAll();

        System.out.println("Is list empty? " + list.isListEmpty());

        list.addToFront(40);
        list.addToBack(50);
        list.addKeyBeforeNode(35, 40);
        list.addKeyAfterNode(45, 40);

        System.out.println("List after inserting before & after 40:");
        list.printAll();
    }
}
