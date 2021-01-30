import java.util.Arrays;

public class InsertionSort {

    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{5 ,8, 9, 2, 7, 3, 1};
        System.out.println("Before the Insertion Sort");
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println("After the Insertion Sort");
        System.out.println(Arrays.toString(array));
    }
}
