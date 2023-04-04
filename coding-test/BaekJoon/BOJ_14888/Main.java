import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static int N, max, min;
    static int[] nums, operators, order;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());

        nums = new int[N + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++)
            nums[i] = Integer.parseInt(st.nextToken());
        
        operators = new int[5];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= 4; i++)
            operators[i] = Integer.parseInt(st.nextToken());
        
        order = new int[N];
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
    }

    static int calculator(int op1, int operator, int op2) {
        if (operator == 1)
            return op1 + op2;
        else if (operator == 2)
            return op1 - op2;
        else if (operator == 3)
            return op1 * op2;
        else
            return op1 / op2;
    }

    static void recFunc(int k, int value) {

        // base case
        if (k == N) {
            max = Math.max(max, value);
            min = Math.min(min, value);

            return;
        }

        // logic
        for (int cand = 1; cand <= 4; cand++) {
            if (operators[cand] >= 1) {
                operators[cand]--;
                order[k] = cand;

                int newValue = calculator(value, cand, nums[k + 1]);

                recFunc(k + 1, newValue);

                operators[cand]++;
                order[k] = 0;
            }
        }
    }

    public static void main(String[] args) throws IOException {
            input();

            recFunc(1, nums[1]);

            sb.append(max).append('\n').append(min);

            System.out.println(sb);
        }
}