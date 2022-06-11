package programmers.map;

import java.util.*;

public class Map_1 {
    public static void main(String[] args) {
        int[] input1 = {3,1,2,3};
        int[] input2 = {3,3,3,2,2,4};
        int[] input3 = {3,3,3,2,2,2};

//        System.out.println(Map_1.solution1(input1));
//        System.out.println(Map_1.solution1(input2));
//        System.out.println(Map_1.solution1(input3));

        System.out.println(Map_1.solution2(input1));
        System.out.println(Map_1.solution2(input2));
        System.out.println(Map_1.solution2(input3));

    }

    // 첫 시도
    private static int solution1(int[] nums) {
        List<Integer> collectionBox = new ArrayList<>();
        int loop = nums.length / 2;
        int result = 0;

        for (int i : nums) {
            if (loop > 0 && !collectionBox.contains(i)) {
                collectionBox.add(i);
                loop--;
            }

            if (i == 0)
                break;
        }

        result = collectionBox.size();
        return result;
    }

    private static int solution2(int[] nums) {
        // 포켓몬의 종류의 개수를 구한다.
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, 0);
        }
        int n1 = map.keySet().size();

        // 배열 크기의 1/2을 구한다.
        int n2 = nums.length /2 ;

        // 최소값을 선택한다.
        return Math.min(n1, n2);
    }
}
