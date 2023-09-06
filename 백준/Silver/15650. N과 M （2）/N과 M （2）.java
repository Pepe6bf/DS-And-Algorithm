import java.util.*;

class Solution {
    private final int N, M;
    private final int[] used, nums;
    private StringBuilder sb = new StringBuilder();

    Solution(int N, int M) {
        this.N = N;
        this.M = M;
        used = new int[N + 1];
        nums = new int[M + 1];
    }

    private void recFunc(int k) {
        if (k == M + 1) {
            for (int i = 1; i <= M; i++) {
                sb.append(nums[i]);
                sb.append(" ");
            }
            sb.append("\n");

            return;
        }

        for (int cand = 1; cand <= N; cand++) {
            if (used[cand] == 1 || nums[k - 1] >= cand) continue;

            used[cand] = 1;
            nums[k] = cand;
            recFunc(k + 1);
            used[cand] = 0;
        }
    }

    public void solution() {
        recFunc(1);

        System.out.println(sb);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        Solution s = new Solution(N, M);
        s.solution();
    }
}