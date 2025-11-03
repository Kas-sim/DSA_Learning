package Test;

public class duplicateCount {
    public static void main(String[] args) {
        int[] arr = {34, 2, 85, 2, 9, 34, 2, 7, 7, 69};

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    int temp = arr[i];
                    for (int l = 0; l < arr.length; l++) {
                        if (arr[l] == temp) {
                            continue;
                        }
                    }
                    count++;

                }

            }

        }

        System.out.print(count + " duplicate found!");

    }
}
