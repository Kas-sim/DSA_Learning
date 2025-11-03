package Recursion;

public class FrequencySort {
    public static String frequencySort(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) freq[s.charAt(i)]++;

        StringBuilder result = new StringBuilder();
        boolean done = false;

        while (!done) {
            done = true;
            int maxFreq = 0;
            int maxChar = 0;

            for (int i = 0; i < 256; i++) {
                if (freq[i] > maxFreq) {
                    maxFreq = freq[i];
                    maxChar = i;
                    done = false;
                }
            }

            for (int j = 0; j < maxFreq; j++) result.append((char) maxChar);
            freq[maxChar] = 0;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));
        System.out.println(frequencySort("cccaaa"));
        System.out.println(frequencySort("Aabb"));
    }
}
