package programmers.map;

import java.util.*;

public class Map_1 {
    public static void main(String[] args) {
        int[] input1 = {3,1,2,3};
        int[] input2 = {3,3,3,2,2,4};
        int[] input3 = {3,3,3,2,2,2};

        System.out.println(Map_1.solution1(input1));
        System.out.println(Map_1.solution1(input2));
        System.out.println(Map_1.solution1(input3));

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
}
