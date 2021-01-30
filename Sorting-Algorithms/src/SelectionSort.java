import java.util.Arrays;

public class SelectionSort {

    public static void sort(int[] list) {
        int minIndex;

        for (int i = 0; i < list.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[minIndex]) {
                    minIndex = j;
                }
            }
            swap(list, i, minIndex);
        }
    }

    public static void swap(int[] list, int index1, int index2) {
        int temp = list[index1];
        list[index1] = list[index2];
        list[index2] = temp;
    }

    public static void main(String[] args) {
        int[] array = new int[]{5 ,8, 9, 2, 7, 3, 1};
        System.out.println("Before the Selection Sort");
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println("After the Selection Sort");
        System.out.println(Arrays.toString(array));
    }
}
