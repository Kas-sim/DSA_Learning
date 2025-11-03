package Recursion;
import java.util.Scanner;

public class task3 {

    public static void printFibonacci(int a, int b, int n) {
        if (n == 0)
            return;
        int c = a + b;
        System.out.print(" " + c);
        printFibonacci(b, c, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: " + a + " " + b);
        printFibonacci(a, b, n - 2);
        sc.close();
    }
}
