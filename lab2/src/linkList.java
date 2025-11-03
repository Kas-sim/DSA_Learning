
public class linkList {
    node Head;

    public linkList() {
        Head = null;
    }

    class node {
        int data;
        node next;

        public node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    void addToFront(int data) {
        node newNode = new node(data);
        newNode.next = Head;
        Head = newNode;
    }

    void addToBack(int data) {
        node newNode = new node(data);
        if (Head == null) {
            Head = newNode;
            return;
        }
        node temp = Head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
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
        node temp = Head;
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
        node temp = Head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = null;
        return val;
    }

    boolean find(int key) {
        node temp = Head;
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
            return;
        }
        node temp = Head;
        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    boolean isListEmpty() {
        return Head == null;
    }

    void addKeyBeforeNode(int key, int target) {
        node newNode = new node(key);
        if (Head == null) return;
        if (Head.data == target) {
            newNode.next = Head;
            Head = newNode;
            return;
        }
        node temp = Head;
        while (temp.next != null && temp.next.data != target) {
            temp = temp.next;
        }
        if (temp.next != null) {
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    void addKeyAfterNode(int key, int target) {
        node temp = Head;
        while (temp != null && temp.data != target) {
            temp = temp.next;
        }
        if (temp != null) {
            node newNode = new node(key);
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    void printList() {
        node temp = Head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    void printAll() {
        printList();
    }

    public static void main(String[] args) {
        linkList list = new linkList();

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
