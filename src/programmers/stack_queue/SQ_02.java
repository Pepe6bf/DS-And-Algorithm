package programmers.stack_queue;

import java.util.*;
import java.util.stream.*;

public class SQ_02 {

    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        System.out.println("SQ_02.solution() = " + Arrays.toString(SQ_02.solution2(progresses, speeds)));
    }

    /**
     * 직접 풀이 (오답)
     */
    private static int[] solution1(int[] progresses, int[] speeds) {
        Queue<Integer> task = new LinkedList<>();
        List<Integer> result = new LinkedList<>();

        // 1. queue에 남은 작업 시간 입력하기
        for (int i = 0; i < progresses.length; i++) {
            // 실수1 : ceil()안에 값들을 float으로 포팅해야 소수로 나눠짐
            int time = (int) Math.ceil((100 - progresses[i]) / speeds[i]);
            task.offer(time);
        }

        // 2. 완료된 작업 추출
        while (!task.isEmpty()) {
            int firstTask = task.poll();
            int loop = 1;

            // 실수2 : 여기를 <=로 바꿔야 했음...
            while (!task.isEmpty() && task.peek() < firstTask) {
                task.poll();
                loop++;
            }
            result.add(loop);
        }

        return result.stream()
                .mapToInt(Integer::intValue).toArray();
    }

    private static int[] solution2(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            float p = progresses[i];
            float s = speeds[i];
            int days = (int) Math.ceil((100 - p) / s);
            queue.offer(days);
        }

        Queue<Integer> answer = new LinkedList<>();
        int d = queue.poll();
        int count = 1;
        while (!queue.isEmpty()) {
            int n = queue.poll();
            if (d >= n) {
                count++;
                continue;
            }

            answer.offer(count);
            count = 1;
            d = n;
        }

        // 마지막 값 추가
        answer.offer(count);

        // int[]형 배열로 변환
        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
