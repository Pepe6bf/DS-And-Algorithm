package programmers.list;

import java.util.Arrays;
import java.util.stream.IntStream;

public class list_1 {
    public static void main(String[] args) {
        int[] input = {1, 3, 5, 4, 5, 2, 1};

        Solution1 s1 = new Solution1();
        int[] answer1 = s1.solution(input);

        System.out.println(Arrays.toString(answer1));
    }
}

/**
 * 첫 번째 시도 : 일단 답 나오도록 풀이
 */
class Solution1 {
    public int[] solution(int[] arr) {
        int max = -1;

        // 배열의 최대값 추출
        for (int n : arr) {
            if (n > max)
                max = n;
        }

        int count = 0;
        for (int n : arr) {
            if (n == max)
                count++;
        }

        int[] answer = new int[count];

        // 최대값의 인덱스를 조회
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                answer[index] = i;
                index++;
            }
        }

        return answer;
    }
}

/**
 * 두 번째 시도 : 람다/스트림 활용
 */
class Solution2 {
    public int[] solution(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        return IntStream.range(0, arr.length)
                .filter(i -> arr[i] == max)
                .toArray();
    }
}