package Test;

public class test1 {
    public static void main(String[] args) {


        int[] arr1 = {5, 7,1, 8, 11, 8};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = i+1; j < arr1.length; j++) {
                if (arr1[i] == arr1[j] ) {
                    System.out.println( arr1[i] + " is duplicate" );
                }
            }
        }


    }
}
