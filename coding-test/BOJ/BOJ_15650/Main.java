/**
https://succulent-bottle-ad0.notion.site/N-M-2-15650-31c040d8b58d4a4eb6e6c8a8f3518776
*/

import java.util.*;

public class Main {

    static StringBuilder result = new StringBuilder();
    static int N, M;
    static int[] selected, used;

    static void input() {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        selected = new int[M + 1];
        used = new int[N + 1];
    }

    static void recFunc(int k) {

        // base case
        if (k == M + 1) {
            for (int i = 1; i <= M; i++)
                result.append(selected[i]).append(" ");
            result.append("\n");

            return;
        }

        // main process
        for (int cand = 1; cand <= N; cand++) {
            if (used[cand] == 1 || selected[k - 1] > cand)
                continue;
            
            selected[k] = cand;
            used[cand] = 1;

            recFunc(k + 1);

            used[cand] = 0;
        }
    }

    public static void main(String[] args) {
        input();

        recFunc(1);

        System.out.println(result);
    }
}