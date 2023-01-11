package algorithm.sort.insertion_sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 3, 8, 0, 5};
        System.out.println("[ 정렬 전 ]");
        System.out.println(Arrays.toString(arr));

        insertionSort(arr);

        System.out.println("[ 정렬 후 ]");
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int insertingData = arr[i];

            int j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > insertingData) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = insertingData;
        }
    }
}
