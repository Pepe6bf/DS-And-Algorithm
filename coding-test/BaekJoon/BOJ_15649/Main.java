import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder result = new StringBuilder();
    static int N, M;
    static int[] selected, used;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        selected = new int[M + 1];
        used = new int[N + 1];
    }

    static void recFunc(int k) {

        // 기저 조건
        if (k == M + 1) {
            for (int i = 1; i <= M; i++)
                result.append(selected[i]).append(" ");
            result.append("\n");

            return;
        }

        // main logic
        for (int cand = 1; cand <= N; cand++) {
            if (used[cand] == 1)
                continue;
            
            selected[k] = cand;
            used[cand] = 1;

            recFunc(k + 1);

            used[cand] = 0;
        }
    }

    public static void main(String[] args) throws IOException {
        input();

        recFunc(1);

        System.out.println(result);
    }
}