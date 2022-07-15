package programmers.set;

import java.util.*;

public class Set_01 {
    /**
     * 직접 풀이
     */
    private static boolean solution1(int[] lotto) {
        boolean answer = true;
        Set<Integer> set = new HashSet<>();

        for (int i : lotto)
            set.add(i);

        for (int s : set) {
            if (s > 45 || s < 1) {
                answer = false;
                break;
            }
        }

        if (set.size() < 6)
            answer = false;

        return answer;
    }
}
