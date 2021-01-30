import java.util.Arrays;
public class MergeSort {

    public static void main(String[] args) {
        int[] array = new int[]{5 ,8, 9, 2, 7, 3, 1};
        System.out.println("Before the Merge Sort");
        System.out.println(Arrays.toString(array));
        mergeSort(array, 0, 6);
        System.out.println("After the Merge Sort");
        System.out.println(Arrays.toString(array));
    }

    public static void mergeSort(int[] array, int leftStart, int rightEnd ){
        if(leftStart >= rightEnd){
            return;
        }

        int middle = (leftStart + rightEnd) / 2;

        mergeSort(array, leftStart, middle);
        mergeSort(array, middle + 1, rightEnd);
        mergeHalves(array, leftStart, rightEnd);

    }

    public static void mergeHalves(int[] array, int leftStart, int rightEnd){
        int[] temp = new int[array.length];
        int leftEnd = (leftStart + rightEnd) / 2;
        int rightStart = leftEnd + 1;
        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        while(left <= leftEnd && right <= rightEnd){
            if(array[left] <= array[right]){
                temp[index] = array[left];
                left++;
            }
            else{
                temp[index] = array[right];
                right++;
            }
            index++;
        }

        while(left <= leftEnd){
            temp[index] = array[left];
            index++;
            left++;
        }

        while(right <= rightEnd){
            temp[index] = array[right];
            index++;
            right++;
        }

        for(int i = leftStart; i <= rightEnd; i++){
            array[i] = temp[i];
        }

    }
}
