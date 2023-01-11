package algorithm.sort.bubble_sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 1};

        System.out.println("=====[ 정렬 실행전 ] ======");
        System.out.println(Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println("=====[ 정렬 실행전 ] ======");
        System.out.println(Arrays.toString(arr));

    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = 0; j < (arr.length - i - 1); j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
