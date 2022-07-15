package programmers.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class list_3 {

    public static void main(String[] args) {
        long inputData1 = 12345;
        // 첫번째 풀이
        System.out.println("list_3.solution1(inputData1) = " + Arrays.toString(list_3.solution1(inputData1)));

        // 두번째 풀이
        System.out.println(Arrays.toString(list_3.solution2(inputData1)));
    }

    /**
     * 첫 번째 풀이 - (직접)
     */
    static int[] solution1(long n) {
        String input = Long.toString(n);
        int[] answer = new int[input.length()];

        for (int i = 0; i < input.length(); i++) {
            answer[i] = (input.charAt(input.length() - (i+1)) - '0');
        }

        return answer;
    }

    /**
     * 두 번째 풀이 - 람다/스트림
     */
    static int[] solution2(long n) {
        List<String> s = Arrays.asList(Long.toString(n).split(""));
        Collections.reverse(s);
        return s.stream().mapToInt(Integer::parseInt).toArray();
    }
}
