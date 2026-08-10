
public class MainProgram {

    public static void main(String[] args) {
        int[] array = {3, 1, 5, 99, 3, 12};

    }

    public static int smallest(int[] array) {
        int smallest = Integer.MAX_VALUE;

        for (int num : array) {
            if (num < smallest) {
                smallest = num;
            }
        }

        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = Integer.MAX_VALUE;
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }

        return index;

    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        if (startIndex < 0 || startIndex >= table.length) {
            return -1;
        }

        int smallest = Integer.MAX_VALUE;
        int index = -1;

        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
                index = i;
            }
        }

        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array){
        for(int i = 0; i < array.length; i++){
            MainProgram.swap(array, i, MainProgram.indexOfSmallestFrom(array, i));
        }
    }

}
