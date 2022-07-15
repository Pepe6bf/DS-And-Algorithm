package programmers.set;

import java.util.*;

public class Set_02 {

    public static void main(String[] args) {
        String[] input = {"tank", "kick", "know", "wheel", "land", "dream"};
        System.out.println(Set_02.solution1(input));

    }

    /**
     * 직접 풀이
     */
    private static boolean solution1(String[] words) {
        Set<String> checkBox = new HashSet<>();

        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].charAt(words[i].length() - 1) != words[i + 1].charAt(0))
                return false;
            checkBox.add(words[i]);
        }
        checkBox.add(words[words.length - 1]);

        return words.length == checkBox.size();
    }
}
