public class StackArray {

    int capacity;
    int[] arr;
    int Top;

    StackArray(int s) {
        this.capacity = s;
        this.arr = new int[s];
        this.Top = -1;
    }

    Boolean isEmpty() {
        if (Top == -1) {
            return true;
        } else {
            return false;
        }
    }

    int push(int s) {
        if (isFull() ) {
            return -1;
        } else {
            Top++;
            arr[Top] = s;
            return arr[Top];
        }
    }

    int pop() {
        if (isEmpty()) {
            return -1;
        } else {
            int a = arr[Top];
            Top--;
            return a;
        }
    }

    int peek() {
        if (isEmpty()) {
            return -1;
        } else {
            return arr[Top];
        }
    }

    Boolean isFull() {
        return Top == capacity -1;
    }

    int getSize() {
        return Top+1;
    }

     int printAll() {
        if (isEmpty() || isFull()) {
            return -1;
        }
        else {
            for (int i = 0; i < Top+1; i++) {
                System.out.println("Element " + (i+1) + ": " + arr[i] );
            }
            return getSize();
        }

    }


    public static void main(String[] args) {

        StackArray stk = new StackArray(10);

        if(stk.isEmpty()) {
            System.out.println("Stack is not Empty!");
        } else {
            System.out.println("Stack is Empty!");
        }

        if(stk.isFull()) {
            System.out.println("Stack is Full!");
        } else {
            System.out.println("Stack is not Full!");
        }

        stk.push(69);
        stk.push(79);
        stk.push(89);
        stk.push(99);
        System.out.println("\n" + stk.peek() + " on top!");
        stk.printAll();
        System.out.println("\nRemoved " + stk.pop() + " from Top");
        System.out.println("\nTotal Size: " + stk.getSize() );

    }

}
