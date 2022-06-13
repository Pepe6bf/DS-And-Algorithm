package programmers.stack_queue;

public class SQ_03 {

    /**
     * 아예 못품
     */
    private static int[] solution1(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];
            int seconds = 0;
            for (int j = i + 1; j < prices.length; j++) {
                seconds++;
                if (price > prices[j]) break;
            }

            answer[i] = seconds;
        }

        return answer;
    }
}
