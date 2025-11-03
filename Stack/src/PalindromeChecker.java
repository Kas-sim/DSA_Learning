import java.util.Stack;

public class PalindromeChecker {

    public static boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return str.equals(reversed.toString());
    }

    public static void main(String[] args) {
        String s1 = "madam";
        String s2 = "hello";
        String s3 = "racecar";

        System.out.println(s1 + " -> " + (isPalindrome(s1) ? "Palindrome" : "Not Palindrome"));
        System.out.println(s2 + " -> " + (isPalindrome(s2) ? "Palindrome" : "Not Palindrome"));
        System.out.println(s3 + " -> " + (isPalindrome(s3) ? "Palindrome" : "Not Palindrome"));
    }
}
