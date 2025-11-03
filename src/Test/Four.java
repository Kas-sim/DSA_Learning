package Test;
public class Four {
    public static void main(String[] args) {
        int[] array = {21, 9, 17, 43, 9, 15, 21, 6, 38, 6};

        System.out.println("Original array is: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        int[] newArray = new int[array.length];
        int size = 0;
        for(int i = 0; i < array.length; i++){
            int j;
            for(j = 0; j < size; j++){
                if(array[i] == newArray[j]){
                    break;
                }
            }
            if(j == size){
                newArray[size++] = array[i];
            }
        }
        System.out.println("\nArray after removing duplicates is: ");
        for(int i = 0; i < size; i++){
            System.out.print(newArray[i] + " ");
        }
        System.out.print("\nThe size of the original arrays was: " + array.length);
        System.out.print("\nThe size of the new arrays is: " + size);
    }
}
