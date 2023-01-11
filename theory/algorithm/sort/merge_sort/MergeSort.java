package algorithm.sort.merge_sort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 3, 8, 0, 5, 7, -1};
        System.out.println("[ 정렬 전 ]");
        System.out.println(Arrays.toString(arr));

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("[ 정렬 후 ]");
        System.out.println(Arrays.toString(arr));


    }

    public static void mergeSort(int[] arr, int leftIndex, int rightIndex) {
        // 배열을 계속해서 분할한다.
        if (leftIndex < rightIndex) { // 기저 조건
            // 배열을 나누기 위해 중간값 계산
            int midIndex = (int) ((leftIndex + rightIndex) / 2);
            // 양쪽 반반식 정렬
            mergeSort(arr, leftIndex, midIndex);
            mergeSort(arr, midIndex + 1, rightIndex);
            merge(arr, leftIndex, midIndex, rightIndex);
        }
    }

    public static void merge(int[] arr, int leftIndex, int midIndex, int rightIndex) {
        int leftAreaIndex = leftIndex;
        int rightAreaIndex = midIndex + 1;

        // tempArr를 생성하고 0으로 모든 요소 초기화
        int[] tempArr = new int[rightIndex + 1];
        for (int i = 0; i < rightIndex + 1; i++) {
            tempArr[i] = 0;
        }

        int tempArrIndex = leftIndex;
        while (leftAreaIndex <= midIndex && rightAreaIndex <= rightIndex) {
            if (arr[leftAreaIndex] <= arr[rightAreaIndex]) {
                tempArr[tempArrIndex] = arr[leftAreaIndex++];
            } else {
                tempArr[tempArrIndex] = arr[rightAreaIndex++];
            }
            tempArrIndex++;
        }

        if (leftAreaIndex > midIndex) {
            for (int i = rightAreaIndex; i <= rightIndex; i++) {
                tempArr[tempArrIndex++] = arr[i];
            }
        } else {
            for (int i = leftAreaIndex; i <= midIndex; i++) {
                tempArr[tempArrIndex++] = arr[i];
            }
        }

        for (int i = leftIndex; i <= rightIndex; i++) {
            arr[i] = tempArr[i];
        }
    }
}
