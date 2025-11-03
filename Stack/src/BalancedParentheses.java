import java.util.Stack;

public class BalancedParentheses {

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) return false;

                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "({[]})";
        String s2 = "({[})";
        String s3 = "((())){}[]";
        String s4 = "([)]";

        System.out.println(s1 + " -> " + (isBalanced(s1) ? "Balanced" : "Not Balanced"));
        System.out.println(s2 + " -> " + (isBalanced(s2) ? "Balanced" : "Not Balanced"));
        System.out.println(s3 + " -> " + (isBalanced(s3) ? "Balanced" : "Not Balanced"));
        System.out.println(s4 + " -> " + (isBalanced(s4) ? "Balanced" : "Not Balanced"));
    }
}
