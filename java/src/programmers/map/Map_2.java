package programmers.map;

import java.util.*;

public class Map_2 {

    public static void main(String[] args) {
        String[] input1 = {"mislav", "stanko", "mislav", "ana"};
        String[] input2 = {"stanko", "ana", "mislav"};

        System.out.println(Map_2.solution2(input1, input2));

    }

    /**
     * 시간 초과가 나는 풀이
     */
    private static String solution1(String[] participant, String[] completion) {
        List<String> players = new LinkedList<>();
        for (String s : participant)
            players.add(s);
        for (String s : completion)
            players.remove(s);  // 이부분에서 시간 초과가 난다.

        return players.get(0);
    }

    /**
     * 강의 풀이
     */
    private static String solution2(String[] participant, String[] completion) {
        Map<String, Integer> players = new HashMap<>();

        for (String p : participant) {
            players.put(p, players.getOrDefault(p, 0) + 1);
        }

        for (String c : completion) {
            int n = players.get(c) - 1;
            if (n == 0) players.remove(c);
            else players.put(c, n);
        }

        return players.keySet().iterator().next();
    }
}
