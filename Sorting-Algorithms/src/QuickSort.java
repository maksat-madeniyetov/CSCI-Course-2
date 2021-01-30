import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = new int[]{5 ,8, 9, 2, 7, 3, 1};
        System.out.println("Before the Quick Sort");
        System.out.println(Arrays.toString(array));
        sort(array, 0, 6);
        System.out.println("After the Quick Sort");
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array, int low, int high) {
        if (low < high) {

            // Save the index of the pivot
            int pi = partition(array, low, high);

            // Before pivot pi
            sort(array, low, pi - 1);

            // After pivot pi
            sort(array, pi + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        // Loop over the array, excluding the pivot
        for (int j = low; j <= high - 1; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }

        // Swap the element at i + 1 with the pivot
        swap(array, i + 1, high);

        // Return the index of where the pivot is now
        return i + 1;
    }

    public static void swap(int[] list, int index1, int index2) {
        int temp = list[index1];
        list[index1] = list[index2];
        list[index2] = temp;
    }
}
