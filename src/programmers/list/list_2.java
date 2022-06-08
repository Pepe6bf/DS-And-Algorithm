package programmers.list;

import java.util.Arrays;
import java.util.stream.IntStream;

public class list_2 {
    public static void main(String[] args) {
        int[] input = {4, 1, 3};

        // 첫번째 풀이
        boolean result1 = list_2.solution1(input);
        System.out.println("result1 = " + result1);

        // 두번째 풀이
        boolean result2 = list_2.solution2(input);
        System.out.println("result2 = " + result2);


    }

    /**
     * 첫 번째 시도
     */
    static boolean solution1(int[] arr) {
        boolean answer = true;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != (i + 1)) {
                answer = false;
                break;
            }
        }

        return answer;
    }

    /**
     * 두 번째 시도 : (강의 풀이)
     */
    static boolean solution2(int[] arr) {
        boolean answer = true;
        int[] checkArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++)
            checkArr[i] = i + 1;

        Arrays.sort(arr);

        return Arrays.equals(arr, checkArr);
    }
}



