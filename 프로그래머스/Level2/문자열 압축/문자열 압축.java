import java.util.*;

class Solution {
    public int solution(String s) {
        int min = s.length();
        for (int length = 1; length < (s.length() / 2 + 1); length++) {
            int pressed = press(length, s);
            min = Math.min(min, pressed);
        }

        return min;
    }

    private int press(int length, String s) {
        StringBuilder sb = new StringBuilder();

        String last = "";
        int count = 0;
        for (String token : split(length, s)) {
            if (token.equals(last)) {
                count++;
                continue;
            }

            // token이 변경된 경우
            if (count > 1) {
                sb.append(count);
            }
            sb.append(last);

            last = token;
            count = 1;
        }

        if (count > 1) {
            sb.append(count);
        }
        sb.append(last);

        return sb.length();
    }

    private List<String> split(int length, String source) {
        List<String> tokens = new ArrayList<>();

        for (int startIndex = 0; startIndex < source.length(); startIndex += length) {
            int endIndex = startIndex + length;

            if (endIndex > source.length()) {
                endIndex = source.length();
            }

            tokens.add(source.substring(startIndex, endIndex));
        }

        return tokens;
    }
}
