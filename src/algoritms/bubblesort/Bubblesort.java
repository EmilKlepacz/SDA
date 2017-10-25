package algoritms.bubblesort;


public class Bubblesort {

    static int[] bubbleSort(int[] arrayToSort) {
        for (int i = 0; i < arrayToSort.length; i++) {
            for (int j = 0; j < arrayToSort.length - 1; j++) {
                if (arrayToSort[j] > arrayToSort[j + 1]) {
                    swapInArray(j + 1, j, arrayToSort);
                }
            }
        }
        return arrayToSort;
    }

    private static void swapInArray(int index, int index2, int[] array) {
        int temp = array[index];
        array[index] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        int[] array = {1, 8, 4, 13, 4, 0, 3, -1, 2, 3};
        int[] sortedArray = bubbleSort(array);
        for (int element : sortedArray) {
            System.out.print(" " + element);
        }
    }
}
