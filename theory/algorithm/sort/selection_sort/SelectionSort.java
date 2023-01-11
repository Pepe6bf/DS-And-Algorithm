package algorithm.sort.selection_sort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 3, 8, 0, 5};
        System.out.println("[ 정렬 전 ]");
        System.out.println(Arrays.toString(arr));

        selectionSort(arr);

        System.out.println("[ 정렬 후 ]");
        System.out.println(Arrays.toString(arr));

    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minValueIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minValueIndex] > arr[j])
                    minValueIndex = j;
            }

            int temp = arr[i];
            arr[i] = arr[minValueIndex];
            arr[minValueIndex] = temp;
        }
    }
}
