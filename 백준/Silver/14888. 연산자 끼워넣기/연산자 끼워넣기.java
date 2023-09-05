import java.util.*;
import java.io.*;

class Solution {
    private int N;
    private int[] nums;
    private int[] operators;
    private int max = Integer.MIN_VALUE;
    private int min = Integer.MAX_VALUE;

    Solution(int N, int[] nums, int[] operators) {
        this.N = N;
        this.nums = nums;
        this.operators = operators;
    }

    private int calculator(int op1, int operator, int op2) {
        if (operator == 1)
            return op1 + op2;
        else if (operator == 2)
            return op1 - op2;
        else if (operator == 3)
            return op1 * op2;
        else
            return op1 / op2;
    }

    private void recFunc(int k, int value) {
        if (k == N) {
            max = Math.max(max, value);
            min = Math.min(min, value);
            return;
        }

        for (int cand = 1; cand <= 4; cand++) {
            if (operators[cand] < 1)
                continue;
            
            operators[cand]--;
            recFunc(k + 1, calculator(value, cand, nums[k + 1]));
            operators[cand]++;
        }
    }

    public void solution() {
        recFunc(1, nums[1]);

        System.out.println(max + "\n" + min);
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        int[] nums = new int[N + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int[] operators = new int[5];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= 4; i++) {
            operators[i] = Integer.parseInt(st.nextToken());
        }

        Solution s = new Solution(N, nums, operators);
        s.solution();
    }
}