package programmers.stack_queue;

import java.util.*;

public class SQ_04 {
    /**
     * 못품... 오답
     */
    private static int solution1(int[] priorities, int location) {
        int target = priorities[location];
        List<Integer> queue = new ArrayList<>();
        for (int p : priorities)
            queue.add(p);

        boolean isMax = false;
        while (!isMax) {
            int task = queue.get(0);
            queue.remove(0);

            for (int p : queue) {
                if (p > task) {
                    queue.add(task);
                    break;
                }
                isMax = true;
            }
        }

        return queue.indexOf(target);
    }

    /**
     * 강의 풀이
     * class를 사용하는 부분에 집중
     */
    static class Paper {
        boolean isMine;
        int priority;

        Paper(int p, boolean m) {
            priority = p;
            isMine = m;
        }
    }

    private static int solution2(int[] priorities, int location) {
        List<Paper> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new Paper(priorities[i], i == location));
        }

        int answer = 0;
        while (!queue.isEmpty()) {
            // 가장 앞 요소를 꺼내옴
            Paper now = queue.remove(0);
            boolean printable = true;
            for (Paper p : queue) {
                if (now.priority < p.priority) {
                    printable = false;
                    break;
                }
            }

            if (!printable) {
                queue.add(now);
                continue;
            }

            // 프린트 횟수 증가
            answer++;
            if (now.isMine)
                return answer;
        }
        return answer;
    }
}
