import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class SampleLL {

public static void main(String[] args) {
    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volve");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);

    LinkedList<Integer> nums = new LinkedList<Integer>();
    nums.add(69);
    nums.add(79);
    nums.add(89);
    nums.add(99);
    System.out.println(nums);



            String[] carsArray = cars.toArray(new String[0]);

            System.out.println("LinkedList: " + cars);

            System.out.println("Array: " + Arrays.toString(carsArray));


            Stack<Integer> stack = new Stack<>();
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);

            while(!stack.isEmpty()) {
                System.out.println(stack.pop());
            }



        }
    }



