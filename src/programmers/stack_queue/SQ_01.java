package programmers.stack_queue;

import java.util.*;

public class SQ_01 {

    /**
     * 직접 풀이
     */
    private static boolean solution1(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ')' && (!stack.empty() && stack.peek() == '(')) {
                stack.pop();
                continue;
            }
            stack.push(c);
        }

        return stack.size() == 0;
    }

    /**
     * 또다른 풀이
     */
    private static boolean solution2(String s) {
        // depth를 이용
        int stack = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') stack++;
            else {
                if (stack == 0) return false;
                stack--;
            }
        }
        return stack == 0;
    }
}
