package Recursion;

 public class RecursionSimulator {

         // Recursive factorial method with depth parameter to simulate call stack
         public static int factorial(int n, int depth) {
         // Print indentation based on depth to simulate the recursion depth
         for (int i = 0; i < depth; i++) {
             System.out.print(" ");
             }
         System.out.println("Calculating factorial(" + n + ")");
         // Base case for recursion
         if (n == 0) {
             for (int i = 0; i < depth; i++) {
                 System.out.print(" ");
                 }
             System.out.println("Base case reached: factorial(0) = 1");
             return 1;
             } else {
             // Recursive case
             int result = n * factorial(n - 1, depth + 1);
             // After recursion returns, print the result of the current factorial call
             for (int i = 0; i < depth; i++) {
                 System.out.print(" ");
                 }
             System.out.println("factorial(" + n + ") = " + result);
             return result;
             }  }
             public static void main(String[] args) {
         int num = 5; // Example input
         System.out.println("Factorial of " + num + " is " + factorial(num, 0));
    }
}