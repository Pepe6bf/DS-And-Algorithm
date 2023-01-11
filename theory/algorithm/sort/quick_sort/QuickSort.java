package algorithm.sort.quick_sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 3, 8, 0, 5, 7, -1};
        System.out.println("[ 정렬 전 ]");
        System.out.println(Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);

        System.out.println("[ 정렬 후 ]");
        System.out.println(Arrays.toString(arr));

    }

    public static void quickSort(int[] arr, int left, int right) {
        // 기저 조건
        if (left <= right) {
            int pivot = divide(arr, left, right);
            // pivot 기준 왼쪽 정렬
            quickSort(arr, left, pivot - 1);
            // pivot 기준 오른쪽 정렬
            quickSort(arr, pivot + 1, right);
        }
    }

    public static int divide(int[] arr, int left, int right) {
        int pivot = arr[left];
        int leftStartIndex = left + 1;
        int rightStartIndex = right;

        // 서로 교차할때까지 반복
        while (leftStartIndex <= rightStartIndex) {
            while (leftStartIndex <= right && pivot >= arr[leftStartIndex]) {
                leftStartIndex++;
            }

            while (rightStartIndex >= (left + 1) && pivot <= arr[rightStartIndex]) {
                rightStartIndex--;
            }

            // 서로 지나치지 않았다면 값을 교환
            if (leftStartIndex <= rightStartIndex) {
                swap(arr, leftStartIndex, rightStartIndex);
            }
        }

        swap(arr, left, rightStartIndex);
        return rightStartIndex;
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
