package programmers.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class Map_3 {

    public static void main(String[] args) {
        String[][] input1 = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        String[][] input2 = {{"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup", "face"}};
        System.out.println(Map_3.solution1(input1));
        System.out.println(Map_3.solution1(input2));
    }

    /**
     * 강의 풀이, 혼자 못품
     */
    private static int solution1(String[][] clothes) {
        // 위장 용품의 종류별 개수를 구한다.
        // 각 개수의 +1을 모두 곱한다.
        // -1해서 리턴한다.

        Map<String, Integer> combination = new HashMap<>();
        int result = 1;

        for (String[] c1 : clothes) {
            combination.put(c1[1], combination.getOrDefault(c1[1], 0) + 1);
        }

        Iterator<Integer> iterator = combination.values().iterator();
        while (iterator.hasNext()) {
            result *= (iterator.next() + 1);
        }

        return result - 1;
    }
}
