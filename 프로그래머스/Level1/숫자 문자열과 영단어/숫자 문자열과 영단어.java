import java.util.*;

class Solution {
    public int solution(String s) {
        Map<String, String> numbers = Map.of(
            "zero", "0",
            "one", "1",
            "two", "2",
            "three", "3",
            "four", "4",
            "five", "5",
            "six", "6",
            "seven", "7",
            "eight", "8",
            "nine", "9"
        );

        for (String number : numbers.keySet()) {
            s= s.replace(number, numbers.get(number));
        }

        return Integer.valueOf(s);
    }
}
