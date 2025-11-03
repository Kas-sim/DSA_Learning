package Recursion;
public class ReconstructSentence {
    public static void main(String[] args) {
        String s1 = "is2 sentence4 This1 a3";
        String s2 = "Myself2 Me1 I4 and3";

        System.out.println("Input: " + s1);
        System.out.println("Output: " + reconstructSentence(s1));

        System.out.println("\nInput: " + s2);
        System.out.println("Output: " + reconstructSentence(s2));
    }

    public static String reconstructSentence(String s) {
        String[] words = s.split(" ");
        String[] arranged = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int len = word.length();
            int position = word.charAt(len - 1) - '0';
            arranged[position - 1] = word.substring(0, len - 1);
        }

        String result = "";
        for (int i = 0; i < arranged.length; i++) {
            result += arranged[i];
            if (i != arranged.length - 1) result += " ";
        }

        return result;
    }
}
