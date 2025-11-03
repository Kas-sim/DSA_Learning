package Test;
public class Three {
    public static void main(String[] args) {
        int[] array = {21, 9, 17, 43, 9, 15, 21, 6, 38, 6};
        int count = 0;
        for(int i = 0; i < array.length - 1; i++){
            for(int j = i+1; j < array.length; j++){
                if(array[i] == array[j]){
                    count++;
                    break;
                }
            }
        }
        System.out.println("Array values are:");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("\nThe count of duplicate values is: " + count);
    }
}