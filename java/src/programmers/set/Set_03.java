package programmers.set;
import java.util.*;
import java.util.stream.IntStream;

public class Set_03 {

    /**
     * 직접 풀이
     */
    private int[] solution1(int[] arr) {
        List<Integer> answer = new LinkedList<>();
        answer.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1])
                answer.add(arr[i]);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
